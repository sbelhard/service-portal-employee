package com.bztda.service.portal.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeEvaluationDto {

	private Long id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private String position;

}
