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

	public EmployeeDto(String lastName, String firstName, String patronymic, String position, String birthDay, String numberPass, String telephone, String email, String dateEndContract, String dateStartContract, String password, String department, String education, String hobby) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.position = position;
		this.birthDay = birthDay;
		this.numberPass = numberPass;
		this.telephone = telephone;
		this.email = email;
		this.dateEndContract = dateEndContract;
		this.dateStartContract = dateStartContract;
		this.password = password;
		this.department = department;
		this.education = education;
		this.hobby = hobby;
	}

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
