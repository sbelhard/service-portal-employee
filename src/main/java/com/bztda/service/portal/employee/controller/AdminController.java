package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.entity.TestPost;
import com.bztda.service.portal.employee.repository.TestPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class AdminController {

    @Autowired
    private TestPostRepository testPostRepository;

    @GetMapping("/")
    public String showAdminPage() {
        return "create-default-page";
    }

    @PostMapping(value = "/test-test")
    public void saveTest(@RequestBody TestPost testPost) {
        testPostRepository.save(testPost);
    }
}

