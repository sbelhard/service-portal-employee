package com.bztda.service.portal.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeLoginDto {

	private Long id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private String position;
	private String role;

}
