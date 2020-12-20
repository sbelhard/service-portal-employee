package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.QuestionDto;
import com.bztda.service.portal.employee.entity.TestPost;
import com.bztda.service.portal.employee.repository.TestPostRepository;
import com.bztda.service.portal.employee.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserController {

    @Autowired
    private final QuestionService questionService;

    @Autowired
    private final TestPostRepository testPostRepository;

    @GetMapping("/user-page")
    public String showPage() {
        return "user-page";
    }

    @GetMapping("/interview")
    public List<QuestionDto> getPageInterview() {
        return questionService.getQuestionRound();
    }

    @PostMapping(name = "/test-test", produces = MediaType.APPLICATION_JSON_VALUE)
    public void getInterview(@RequestBody TestPost testPost) {
        testPostRepository.save(testPost);
    }
}
