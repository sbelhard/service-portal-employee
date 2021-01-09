package com.bztda.service.portal.employee.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController {

	@PostMapping("/login")
	public void loginUserService() {
		System.out.println();
	}
}
