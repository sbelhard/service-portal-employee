package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.EvaluationDto;
import com.bztda.service.portal.employee.entity.Evaluation;
import org.springframework.stereotype.Service;


@Service
public class EvaluationService {

	public Evaluation editEvaluationDtoEvaluation(EvaluationDto evaluationDto) {
		return Evaluation.builder()
				.criteriaId(evaluationDto.getCriteriaId())
				.staffEvaluateId(evaluationDto.getStaffEvaluateId())
				.value(evaluationDto.getValue().longValue())
				.build();
	}
}
