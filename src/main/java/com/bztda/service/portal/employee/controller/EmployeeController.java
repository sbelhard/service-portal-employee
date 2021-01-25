package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.EmployeeDto;
import com.bztda.service.portal.employee.dto.EmployeeLoginDto;
import com.bztda.service.portal.employee.dto.LoginDto;
import com.bztda.service.portal.employee.entity.DataEmployee1C;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.repository.DataEmployee1CRepository;
import com.bztda.service.portal.employee.repository.EmployeeHobbiesRepository;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.service.EmployeeService;
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

	@Autowired
	private final EmployeeRepository employeeRepository;

	@Autowired
	private final EmployeeService employeeService;

	@Autowired
	private final DataEmployee1CRepository dataEmployee1CRepository;

	@PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeLoginDto loginUserService(@RequestBody LoginDto loginDto) {
		EmployeeLoginDto employeeLoginDto = loginService.getEmployeeLoginDto(loginDto);
		return employeeLoginDto;
	}

	@PostMapping(value = "/get-data-employee", produces = MediaType.APPLICATION_JSON_VALUE)
	public DataEmployee1C getData1CForRegistry(@RequestBody String numberPass) {
		DataEmployee1C employeeData1C = dataEmployee1CRepository.findByNumberPass(numberPass);
		return employeeData1C;
	}

	@PostMapping(value = "/registry", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeLoginDto registryEmployee(@RequestBody EmployeeDto employeeDto) {
		Employee employee = employeeRepository.save(employeeService.editEmployeeDtoEmployee(employeeDto));
		dataEmployee1CRepository.update(true);
		EmployeeLoginDto employeeLoginDto = EmployeeLoginDto.builder()
				.id(employee.getId())
				.firstName(employee.getFirstName())
				.lastName(employee.getLastName())
				.patronymic(employee.getPatronymic())
				.position(employee.getPosition())
				.role(employee.getRole().getRole())
				.build();
		return employeeLoginDto;
	}

}
