package com.bztda.service.portal.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "employee_hobbies", schema = "portal_storage")
public class EmployeeHobbies extends BaseEntity<Long> {

	@Column(name = "employee_id")
	private Long employeeId;

	@Column(name = "hobbies_id")
	private Long hobbiesId;
}