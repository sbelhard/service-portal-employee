package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.EmployeeDto;
import com.bztda.service.portal.employee.dto.EmployeeEvaluationDto;
import com.bztda.service.portal.employee.entity.Department;
import com.bztda.service.portal.employee.entity.Education;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.entity.Role;
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
					.firstName(employee.getFirstName())
					.patronymic(employee.getPatronymic())
					.position(employee.getPosition())
					.build());
		});
		return employeeEvaluationDtoList;
	}

	public Employee editEmployeeDtoEmployee(EmployeeDto employeeDto) {
		 return Employee.builder()
				.lastName(employeeDto.getLastName())
				.firstName(employeeDto.getFirstName())
				.patronymic(employeeDto.getPatronymic())
				.position(employeeDto.getPosition())
				.department(Department.builder()
						.department(employeeDto.getDepartment())
						.build())
				.birthDay(employeeDto.getBirthDay())
				.numberPass(employeeDto.getNumberPass())
				.telephone(employeeDto.getTelephone())
				.email(employeeDto.getEmail())
				.education(Education.builder()
						.education(employeeDto.getEducation())
						.build())
				.training(employeeDto.isTraining())
				.dateEndContract(employeeDto.getDateEndContract())
				.dateStartContract(employeeDto.getDateStartContract())
				.role(Role.builder()
						.role("User")
						.build())
				.password(employeeDto.getPassword())
				.build();
	}

}
