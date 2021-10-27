package com.bztda.service.portal.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InquiryDto {

	private String inquiryPeriod;
	private String organizationProvided;
	private Long typeInquiryId;
	private Long EmployeeId;

}
