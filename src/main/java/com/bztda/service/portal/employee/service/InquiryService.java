package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.InquiryDto;
import com.bztda.service.portal.employee.dto.InquiryEmployeeDto;
import com.bztda.service.portal.employee.entity.Inquiry;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.repository.InquiryRepository;
import com.bztda.service.portal.employee.repository.TypeInquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class InquiryService {

	@Autowired
	private InquiryRepository inquiryRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private TypeInquiryRepository typeInquiryRepository;

	public void editAndSaveInquiryDtoInquiry(InquiryDto inquiryDto) {
		inquiryRepository.save(Inquiry.builder()
				.employee(employeeRepository.findById(inquiryDto.getEmployeeId()).get())
				.typeInquiry(typeInquiryRepository.findById(inquiryDto.getTypeInquiryId()).get())
				.inquiryPeriod(inquiryDto.getInquiryPeriod())
				.organizationProvided(inquiryDto.getOrganizationProvided())
				.build());
	}

	public List<InquiryEmployeeDto> editInquiryInquiryDto(Long id) {
		List<Inquiry> inquiryEmployee = inquiryRepository.findAllByEmployee(employeeRepository.findById(id).get());
		List<InquiryEmployeeDto> inquiryEmployeeDtos = new ArrayList<>();
		for (Inquiry inquiry : inquiryEmployee) {
			inquiryEmployeeDtos.add(InquiryEmployeeDto.builder()
					.inquiryPeriod(inquiry.getInquiryPeriod())
					.organizationProvided(inquiry.getOrganizationProvided())
					.typeInquiry(inquiry.getTypeInquiry().getType())
					.build());
		}
		return inquiryEmployeeDtos;
	}
}
