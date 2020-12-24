package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.EmployeeEvaluationDto;
import com.bztda.service.portal.employee.entity.Criteria;
import com.bztda.service.portal.employee.entity.Department;
import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.entity.OverallCriteria;
import com.bztda.service.portal.employee.repository.CriteriaRepository;
import com.bztda.service.portal.employee.repository.DepartmentRepository;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.repository.EvaluationRepository;
import com.bztda.service.portal.employee.repository.OverallCriteriaRepository;
import com.bztda.service.portal.employee.repository.StaffEvaluateRepository;
import com.bztda.service.portal.employee.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @Autowired
    private final OverallCriteriaRepository overallCriteriaRepository;

    @Autowired
    private final CriteriaRepository criteriaRepository;

    @Autowired
    private final StaffEvaluateRepository staffEvaluateRepository;

    @Autowired
    private final EvaluationRepository evaluationRepository;

    @GetMapping("/department")
    public List<Department> getDepartments() {
        return departmentRepository.findAll();
    }

    @GetMapping("/overallcriteria")
    public List<OverallCriteria> getOverallCriteria() {
        return overallCriteriaRepository.findAll();
    }

    @GetMapping("/criteria")
    public List<Criteria> getOverallCriteriaCriteria() {
        return criteriaRepository.findAll();
    }

    @PostMapping("/criteria")
    public void getEvaluation() {

    }

    @GetMapping("/department/{department}")
    public List<EmployeeEvaluationDto> getEmployee(@PathVariable String department) {
        List<Employee> employeeByDepartment = employeeRepository.findAllByDepartmentDepartment(department);
        return employeeService.editEmployee(employeeByDepartment);
    }
}
