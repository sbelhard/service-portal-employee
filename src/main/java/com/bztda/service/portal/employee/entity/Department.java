package com.bztda.service.portal.employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.util.ArrayList;
import java.util.List;


@Data
@ToString(exclude = "employees")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Component
@Builder
@Entity
@Table(name = "departments", schema = "portal_storage")
public class Department extends BaseEntity<Long> {

	@Column(name = "department")
	private String department;

	@JsonIgnore
	@OneToMany(mappedBy = "department")
	private List<Employee> employees = new ArrayList<>();

	@JsonIgnore
	@OneToMany(mappedBy = "department")
	private List<DataEmployee1C> dataEmployee1C = new ArrayList<>();

}
