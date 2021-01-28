package com.bztda.service.portal.employee.dto;

import com.bztda.service.portal.employee.entity.Department;
import com.bztda.service.portal.employee.entity.Education;
import com.bztda.service.portal.employee.entity.Hobbies;
import com.bztda.service.portal.employee.entity.Inquiry;
import com.bztda.service.portal.employee.entity.Role;
import com.bztda.service.portal.employee.entity.StaffEvaluate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
	private LocalDate birthDay;
	private String numberPass;
	private String telephone;
	private String email;
	private LocalDate dateEndContract;
	private LocalDate dateStartContract;
	private String password;
	private String department;
	private String education;
	private String [] hobbies;

	private List<Inquiry> inquiries = new ArrayList<>();

}
