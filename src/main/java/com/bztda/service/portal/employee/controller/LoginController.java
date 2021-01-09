package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController {

	@PostMapping("/login")
	public void loginUserService(@RequestBody UserDto user) {
		System.out.println(user.toString());
	}

//    @GetMapping("/login-error")
//    public String getLoginPageError() {
//        return "No user or bad password";
//    }

	@GetMapping("/login")
	public RedirectView showLoginPage() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("http://localhost:3000/reg");
		return redirectView;
	}
}
