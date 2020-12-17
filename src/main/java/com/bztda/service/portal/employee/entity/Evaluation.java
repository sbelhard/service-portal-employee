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

import java.time.LocalDate;


@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "evaluation", schema = "portal_storage")
public class Evaluation extends BaseEntity<Long> {

	@Column(name = "value")
	private int value;

	@Column(name = "criteria_id")
	private Long criteriaId;

	@Column(name = "staff_evaluate_id")
	private Long staffEvaluateId;

}
