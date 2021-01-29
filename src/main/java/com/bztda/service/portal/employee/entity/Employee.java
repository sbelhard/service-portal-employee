package com.bztda.service.portal.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@ToString(exclude = {"hobbies", "staffEvaluateValuingEmployee", "staffEvaluateEvaluateEmployee", "inquiries"})
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "employee", schema = "portal_storage")
public class Employee extends BaseEntity<Long> {

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "patronymic")
	private String patronymic;

	@Column(name = "position")
	private String position;

	@Column(name = "birth_day")
	private LocalDate birthDay;

	@Column(name = "hobby")
	private String hobby;

	@Column(name = "number_pass")
	private String numberPass;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "email")
	private String email;

	@Column(name = "date_end_contract")
	private LocalDate dateEndContract;

	@Column(name = "date_start_contract")
	private LocalDate dateStartContract;

	@Column(name = "password")
	private String password;

	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;

	@ManyToOne
	@JoinColumn(name = "education_id")
	private Education education;

	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role role;

	@OneToMany(mappedBy = "employeeValuing")
	private List<StaffEvaluate> staffEvaluateValuingEmployee = new ArrayList<>();

	@OneToMany(mappedBy = "employeeEvaluate")
	private List<StaffEvaluate> staffEvaluateEvaluateEmployee = new ArrayList<>();

	@OneToMany(mappedBy = "employee")
	private List<Inquiry> inquiries = new ArrayList<>();

	@OneToOne(mappedBy = "employee")
	private Rating rating;
}
