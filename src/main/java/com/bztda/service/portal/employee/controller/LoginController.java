package com.bztda.service.portal.employee.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController {

 /*   @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public void loginUserService() {
    }*/

    @GetMapping("/login-error")
    public String getLoginPageError() {
        return "No user or bad password";
    }
}
