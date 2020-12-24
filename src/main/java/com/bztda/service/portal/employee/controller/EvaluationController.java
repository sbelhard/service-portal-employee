package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.EmployeeEvaluationDto;
import com.bztda.service.portal.employee.entity.Department;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.repository.DepartmentRepository;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.service.EmployeeService;
import jdk.nashorn.internal.objects.annotations.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/evaluation")
public class EvaluationController {

	@Autowired
	private final DepartmentRepository departmentRepository;

	@Autowired
	private final EmployeeRepository employeeRepository;

	@Autowired
	private final EmployeeService employeeService;

	@GetMapping("/department")
	public List<Department> getDepartments() {
		return departmentRepository.findAll();
	}

	@GetMapping(value = "/departments", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<EmployeeEvaluationDto> getEmployee() {
		List<Employee> employeeByDepartment = employeeRepository.findByDepartment(Department.builder()
				.department("Отдел кадров")
				.build());
		return employeeService.editEmployee(employeeByDepartment);
	}
}
