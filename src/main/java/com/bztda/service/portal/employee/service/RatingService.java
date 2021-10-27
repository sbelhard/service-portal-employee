package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.EvaluationDto;
import com.bztda.service.portal.employee.entity.Rating;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.repository.EvaluationRepository;
import com.bztda.service.portal.employee.repository.RatingRepository;
import com.bztda.service.portal.employee.repository.StaffEvaluateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Autowired
	private EvaluationRepository evaluationRepository;

	@Autowired
	private StaffEvaluateRepository staffEvaluateRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	public void updateRatingEmployee(EvaluationDto evaluationDto) {
		Optional<Rating> rating = Optional.ofNullable(ratingRepository.findByEmployee(
				employeeRepository.findById(evaluationDto.getStaffValuingId()).orElseThrow(NullPointerException::new)));
		int oldValueRating = rating.get().getRating();
		int value = evaluationDto.getValue();
		int newValueRating = oldValueRating + value;
		ratingRepository.update(newValueRating);
	}
}
