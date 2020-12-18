package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.QuestionDto;
import com.bztda.service.portal.employee.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    @Autowired
    private final QuestionService questionService;

    @GetMapping("/user-page")
    public String showPage() {
        return "user-page";
    }

    @GetMapping("/interview")
    public List<QuestionDto> getPageInterview() {
        return questionService.getQuestionRound();
    }
}
