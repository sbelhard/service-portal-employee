package com.bztda.service.portal.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Data
@ToString(exclude = "answers")
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "rating", schema = "portal_storage")
public class Rating extends BaseEntity<Long> {

	@Column(name = "rating")
	private Long rating;

	@OneToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

}
