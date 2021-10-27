package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.QuestionDto;
import com.bztda.service.portal.employee.entity.TestPost;
import com.bztda.service.portal.employee.repository.QuestionRepository;
import com.bztda.service.portal.employee.repository.TestPostRepository;
import com.bztda.service.portal.employee.service.QuestionService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	@GetMapping("/")
	public String showAdminPage() {
		return "create-default-page";
	}

	@PostMapping(value = "/add-question", produces = MediaType.APPLICATION_JSON_VALUE)
	public void saveQuestion(@RequestBody QuestionDto questionDto) {
		questionService.editQuestionDtoQuestionAndSave(questionDto);
	}
}

