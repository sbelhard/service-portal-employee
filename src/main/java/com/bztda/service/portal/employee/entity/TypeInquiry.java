package com.bztda.service.portal.employee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Data
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Component
@Entity
@Table(name = "type_inquiry", schema = "portal_storage")
public class TypeInquiry extends BaseEntity<Long> {

	@Column(name = "type")
	private String type;

	@OneToMany(mappedBy = "typeInquiry")
	private List<Inquiry> inquiries = new ArrayList<>();
}
