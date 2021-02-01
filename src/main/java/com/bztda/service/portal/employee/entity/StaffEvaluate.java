package com.bztda.service.portal.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "staff_evaluate", schema = "portal_storage")
public class StaffEvaluate extends BaseEntity<Long> {

	@Column(name = "date_evaluation")
	private LocalDate date;

	@ManyToOne
	@JoinColumn(name = "valuing_employee_id")
	private Employee employeeValuing;

	@ManyToOne
	@JoinColumn(name = "evaluate_employee_id")
	private Employee employeeEvaluate;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "evaluation", schema = "portal_storage",
			joinColumns = @JoinColumn(name = "staff_evaluate_id"),
			inverseJoinColumns = @JoinColumn(name = "criteria_id"))
	private List<Criteria> criteriaEvaluates = new ArrayList<>();

}
