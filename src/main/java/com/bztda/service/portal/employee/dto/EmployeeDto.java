package com.bztda.service.portal.employee.dto;

import com.bztda.service.portal.employee.entity.Inquiry;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeDto {

	private String lastName;
	private String firstName;
	private String patronymic;
	private String position;
	private String birthDay;
	private String numberPass;
	private String telephone;
	private String email;
	private String dateEndContract;
	private String dateStartContract;
	private String password;
	private String department;
	private String education;
	private String hobby;

	private List<Inquiry> inquiries = new ArrayList<>();

}
