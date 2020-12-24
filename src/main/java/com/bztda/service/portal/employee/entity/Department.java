package com.bztda.service.portal.employee.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
	@OneToMany(mappedBy = "departmentEmployee", cascade = CascadeType.ALL)
	private List<Employee> employees = new ArrayList<>();
}
