package com.bztda.service.portal.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "inquiry", schema = "portal_storage")
public class Inquiry extends BaseEntity<Long> {

	@Column(name = "inquiry_period")
	private String inquiryPeriod;

	@Column(name = "organization_provided")
	private String organizationProvided;

	@ManyToOne
	@JoinColumn(name = "type_inquiry_id")
	private TypeInquiry typeInquiry;

	@ManyToOne
	@JoinColumn(name = "employee_id")
	private  Employee employee;

}
