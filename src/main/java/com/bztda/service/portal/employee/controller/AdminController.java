package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.UserDetailDto;
import com.bztda.service.portal.employee.entity.TestPost;
import com.bztda.service.portal.employee.repository.TestPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


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

	@PostMapping("/login")
	public void showLoginPage() {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://regg-e4f7e.web.app/");
	}
}

