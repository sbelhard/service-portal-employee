package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.EvaluationDto;
import com.bztda.service.portal.employee.entity.StaffEvaluate;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class StaffEvaluateService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public StaffEvaluate editEvaluationDtoStaffEvaluate(EvaluationDto evaluationDto) {
		StaffEvaluate staffEvaluate = StaffEvaluate.builder()
				.employeeValuing(employeeRepository.findById(evaluationDto.getStaffValuingId()).orElseThrow(NullPointerException::new))
				.employeeEvaluate(employeeRepository.findById(evaluationDto.getStaffEvaluateId()).orElseThrow(NullPointerException::new))
				.date(LocalDate.now())
				.build();
		return staffEvaluate;
	}
}
