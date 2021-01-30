package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.EmployeeLoginDto1Cdto;
import com.bztda.service.portal.employee.dto.LoginDto;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public EmployeeLoginDto1Cdto getEmployeeLoginDto(LoginDto loginDto) {
		EmployeeLoginDto1Cdto employeeLoginDto1Cdto;
		try {
			Employee employee = employeeRepository.findByEmail(loginDto.getEmail());
			employeeLoginDto1Cdto = EmployeeLoginDto1Cdto.builder()
					.id(employee.getId())
					.firstName(employee.getFirstName())
					.lastName(employee.getLastName())
					.patronymic(employee.getPatronymic())
					.position(employee.getPosition())
					.email(employee.getEmail())
					.role(employee.getRole().getRole())
					.build();
			return employeeLoginDto1Cdto;
		} catch (Exception ex) {
			return null;
		}
	}
}



