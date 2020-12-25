package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.StaffEvaluateDto;
import com.bztda.service.portal.employee.entity.StaffEvaluate;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.repository.StaffEvaluateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;


@Service
public class StaffEvaluateService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public StaffEvaluate editStaffEvaluateDtoStaffEvaluate(StaffEvaluateDto staffEvaluateDto) {
		StaffEvaluate staffEvaluate = StaffEvaluate.builder()
				.employeeValuing(employeeRepository.findById(staffEvaluateDto.getValuingEmployeeId()).orElseThrow(NullPointerException::new))
				.employeeEvaluate(employeeRepository.findById(staffEvaluateDto.getEvaluateEmployeeId()).orElseThrow(NullPointerException::new))
				.localDate(LocalDate.parse(staffEvaluateDto.getDateEvaluation()))
				.build();
		return staffEvaluate;
	}
}
