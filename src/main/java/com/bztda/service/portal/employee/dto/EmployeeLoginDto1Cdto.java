package com.bztda.service.portal.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeLoginDto1Cdto {

	private Long id;
	private String lastName;
	private String firstName;
	private String patronymic;
	private String position;
	private String role;
	private LocalDate birthDay;
	private String numberPass;
	private LocalDate dateEndContract;
	private LocalDate dateStartContract;
	private String department;
	private String email;
	private boolean isEmployee;



	public EmployeeLoginDto1Cdto(String lastName, String firstName, String patronymic, String position, LocalDate birthDay, String numberPass, LocalDate dateEndContract, LocalDate dateStartContract, String department, boolean isEmployee) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.position = position;
		this.birthDay = birthDay;
		this.numberPass = numberPass;
		this.dateEndContract = dateEndContract;
		this.dateStartContract = dateStartContract;
		this.department = department;
		this.isEmployee = isEmployee;
	}

	public EmployeeLoginDto1Cdto(Long id, String lastName, String firstName, String patronymic, String position, String role, boolean isEmployee) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.patronymic = patronymic;
		this.position = position;
		this.role = role;
		this.isEmployee = isEmployee;
	}
}
