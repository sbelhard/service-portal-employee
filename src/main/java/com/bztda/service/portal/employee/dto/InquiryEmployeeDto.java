package com.bztda.service.portal.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InquiryEmployeeDto {

	private String inquiryPeriod;
	private String organizationProvided;
	private String typeInquiry;

}
