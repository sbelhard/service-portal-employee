package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.entity.TestPostMethod;
import com.bztda.service.portal.employee.repository.TestPostMethodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdminController {

    @Autowired
    private TestPostMethodRepository testPostMethodRepository;

    @GetMapping("/")
    public String showAdminPage() {
        return "create-default-page";
    }

    @PostMapping(value = "/test-test", produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveTest(@RequestBody Map<String, String> test) {
        TestPostMethod build = TestPostMethod.builder().text(test.get("id")).build();
        testPostMethodRepository.save(build);
    }
}

