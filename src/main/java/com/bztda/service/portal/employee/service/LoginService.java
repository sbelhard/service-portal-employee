package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.EmployeeLoginDto;
import com.bztda.service.portal.employee.dto.LoginDto;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public boolean getLogin(LoginDto loginDto) {
		Employee employee = employeeRepository.findByEmail(loginDto.getEmail());
		return employee != null;
	}

	public EmployeeLoginDto getEmployeeLoginDto(LoginDto loginDto) {
		if (getLogin(loginDto)) {
			Employee employee = employeeRepository.findByEmail(loginDto.getEmail());
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
		return null;
	}
}


