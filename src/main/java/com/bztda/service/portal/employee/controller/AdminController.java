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
}

