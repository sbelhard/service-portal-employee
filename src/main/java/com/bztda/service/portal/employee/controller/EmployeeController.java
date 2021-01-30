package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.EmployeeDto;
import com.bztda.service.portal.employee.dto.EmployeeLoginDto1Cdto;
import com.bztda.service.portal.employee.dto.LoginDto;
import com.bztda.service.portal.employee.entity.DataEmployee1C;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.repository.DataEmployee1CRepository;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.service.EmployeeService;
import com.bztda.service.portal.employee.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;


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
	public EmployeeLoginDto1Cdto loginUserService(@RequestBody LoginDto loginDto) {
		EmployeeLoginDto1Cdto employeeLoginDto1Cdto;
		employeeLoginDto1Cdto = loginService.getEmployeeLoginDto(loginDto);
		if (employeeLoginDto1Cdto == null) {
			DataEmployee1C dataEmployee1C = dataEmployee1CRepository.findByNumberPass(loginDto.getNumberPassOrEmail());
			employeeLoginDto1Cdto = EmployeeLoginDto1Cdto.builder()
					.lastName(dataEmployee1C.getLastName())
					.firstName(dataEmployee1C.getFirstName())
					.patronymic(dataEmployee1C.getPatronymic())
					.birthDay(dataEmployee1C.getBirthDay())
					.dateEndContract(dataEmployee1C.getDateEndContract())
					.dateStartContract(dataEmployee1C.getDateStartContract())
					.department(dataEmployee1C.getDepartment())
					.numberPass(loginDto.getNumberPassOrEmail())
					.position(dataEmployee1C.getPosition())
					.isEmployee(dataEmployee1C.isEmployee())
					.build();
			return employeeLoginDto1Cdto;
		}
		return employeeLoginDto1Cdto;
	}

	@PostMapping(value = "/registry", produces = MediaType.APPLICATION_JSON_VALUE)
	public EmployeeLoginDto1Cdto registryEmployee(@RequestBody EmployeeDto employeeDto) throws Throwable {
		try {
			Employee employee = employeeRepository.save(employeeService.editEmployeeDtoEmployee(employeeDto));
			dataEmployee1CRepository.update(true, employeeDto.getNumberPass());
			EmployeeLoginDto1Cdto employeeLoginDto1Cdto = EmployeeLoginDto1Cdto.builder()
					.id(employee.getId())
					.firstName(employee.getFirstName())
					.lastName(employee.getLastName())
					.patronymic(employee.getPatronymic())
					.position(employee.getPosition())
					.role(employee.getRole().getRole())
					.build();
			return employeeLoginDto1Cdto;
		} catch (Exception ex) {
			ex.getCause().getMessage();
		}
		return EmployeeLoginDto1Cdto.builder().build();
	}
}

