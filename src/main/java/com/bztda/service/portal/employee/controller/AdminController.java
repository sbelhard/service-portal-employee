package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.AnswerDto;
import com.bztda.service.portal.employee.dto.QuestionDto;
import com.bztda.service.portal.employee.entity.Question;
import com.bztda.service.portal.employee.entity.Result;
import com.bztda.service.portal.employee.repository.QuestionRepository;
import com.bztda.service.portal.employee.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdminController {

    @Autowired
    private final QuestionRepository questionRepository;

    @Autowired
    private final AnswerService answerService;


    @GetMapping("/")
    public String showAdminPage() {
        return "create-default-page";
    }

    @GetMapping("add-question")
    public String pageAddQuestion(Model model) {
        List<AnswerDto> answerDtoList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            answerDtoList.add(new AnswerDto());
        }
        QuestionDto questionDto = QuestionDto.builder()
                .listAnswerDto(answerDtoList)
                .build();
        model.addAttribute("questionDto", questionDto);
        model.addAttribute("results", Result.values());
        return "add-question";
    }

    @PostMapping("add-question")
    public String addQuestion(QuestionDto questionDto) {
        Question question = Question.builder()
                .question(questionDto.getQuestion())
                .build();
        questionRepository.save(question);

        answerService.getAnswerDtoAnswerAndSaveAnswer(questionDto, question);

        return "info-add-question";
    }
}

