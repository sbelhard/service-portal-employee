package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.EmployeeEvaluationDto;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService implements UserDetailsService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public List<EmployeeEvaluationDto> editEmployee(List<Employee> employees) {
		List<EmployeeEvaluationDto> employeeEvaluationDtoList = new ArrayList<>();
		employees.forEach(employee -> {
			employeeEvaluationDtoList.add(EmployeeEvaluationDto.builder()
					.id(employee.getId())
					.lastName(employee.getLastName())
					.firstName(employee.getFirst_name())
					.patronymic(employee.getPatronymic())
					.position(employee.getPosition())
					.build());
		});
		return employeeEvaluationDtoList;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return Optional.of(username)
				.map(employeeRepository::findByEmail)
				.map(employee -> User.builder()
						.username(employee.getEmail())
						.password(employee.getPassword())
						.authorities(employee.getRole().getRole())
						.build())
				.orElseThrow(() -> new UsernameNotFoundException("User not found"));
	}
}
