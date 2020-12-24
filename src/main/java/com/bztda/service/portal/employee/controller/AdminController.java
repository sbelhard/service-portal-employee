package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.AnswerDto;
import com.bztda.service.portal.employee.dto.QuestionDto;
import com.bztda.service.portal.employee.entity.Question;
import com.bztda.service.portal.employee.entity.Result;
import com.bztda.service.portal.employee.repository.QuestionRepository;
import com.bztda.service.portal.employee.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("api/")
public class AdminController {

    @Autowired
    private TestPostMethodRepository testPostMethodRepository;

    @GetMapping("/")
    public String showAdminPage() {
        return "create-default-page";
    }

    @PostMapping(value = "/test-test", produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveTest(@RequestBody TestPostMethod testPostMethod) {
        testPostMethodRepository.save(testPostMethod);
    }
}

