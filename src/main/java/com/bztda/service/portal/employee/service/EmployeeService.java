package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.EmployeeDto;
import com.bztda.service.portal.employee.dto.EmployeeEvaluationDto;
import com.bztda.service.portal.employee.entity.Department;
import com.bztda.service.portal.employee.entity.Education;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.entity.Role;
import com.bztda.service.portal.employee.repository.DataEmployee1CRepository;
import com.bztda.service.portal.employee.repository.DepartmentRepository;
import com.bztda.service.portal.employee.repository.EducationRepository;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EducationRepository educationRepository;

	@Autowired
	private RoleRepository roleRepository;

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
				.department(departmentRepository.findByDepartment(employeeDto.getDepartment()))
				.birthDay(LocalDate.parse(employeeDto.getBirthDay()))
				.numberPass(employeeDto.getNumberPass())
				.telephone(employeeDto.getTelephone())
				.email(employeeDto.getEmail())
				.education(educationRepository.findByEducation(employeeDto.getEducation()))
				.dateEndContract(LocalDate.parse(employeeDto.getDateEndContract()))
				.dateStartContract(LocalDate.parse(employeeDto.getDateStartContract()))
				.role(roleRepository.findByRole("USER"))
				.password(employeeDto.getPassword())
				.hobby(employeeDto.getHobby())
				.build();
	}
}
