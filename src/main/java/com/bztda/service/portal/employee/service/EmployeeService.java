package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.EmployeeEvaluationDto;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {

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

}
