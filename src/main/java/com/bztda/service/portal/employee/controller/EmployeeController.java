package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.EmployeeDto;
import com.bztda.service.portal.employee.dto.EmployeeLoginDto;
import com.bztda.service.portal.employee.dto.LoginDto;
import com.bztda.service.portal.employee.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeController {

	@Autowired
	private final LoginService loginService;

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeLoginDto loginUserService(@RequestBody LoginDto loginDto) {
		EmployeeLoginDto employeeLoginDto = loginService.getEmployeeLoginDto(loginDto);
		return employeeLoginDto;
	}

	@PostMapping(value = "/registry", produces = MediaType.APPLICATION_JSON_VALUE)
	public void registryEmployee(@RequestBody EmployeeDto employeeDto) {

	}

}
