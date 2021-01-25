package com.bztda.service.portal.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "employee_data1c", schema = "portal_storage")
public class DataEmployee1C extends BaseEntity<Long> {

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

	@Column(name = "number_pass")
	private String numberPass;

	@Column(name = "date_end_contract")
	private LocalDate dateEndContract;

	@Column(name = "date_start_contract")
	private LocalDate dateStartContract;

	@JoinColumn(name = "department")
	private String department;

	@JoinColumn(name = "is_employee")
	private boolean isEmployee;

}
