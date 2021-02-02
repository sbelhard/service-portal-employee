package com.bztda.service.portal.employee.controller;

import com.bztda.service.portal.employee.dto.InquiryDto;
import com.bztda.service.portal.employee.dto.InquiryEmployeeDto;
import com.bztda.service.portal.employee.dto.TypeInquiryDto;
import com.bztda.service.portal.employee.repository.InquiryRepository;
import com.bztda.service.portal.employee.repository.TypeInquiryRepository;
import com.bztda.service.portal.employee.service.InquiryService;
import com.bztda.service.portal.employee.service.TypeInquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class InquiryController {

	@Autowired
	private final InquiryRepository inquiryRepository;

	@Autowired
	private final TypeInquiryRepository typeInquiryRepository;

	@Autowired
	private final TypeInquiryService typeInquiryService;

	@Autowired
	private final InquiryService inquiryService;

	@GetMapping("/type-inquiry")
	public List<TypeInquiryDto> getTypeInquiry() {
		return typeInquiryService.getAllTypeInquiry();
	}

	@PostMapping(value = "/inquiry", produces = MediaType.APPLICATION_JSON_VALUE)
	public void saveQuestion(@RequestBody InquiryDto inquiryDto) {
		inquiryService.editAndSaveInquiryDtoInquiry(inquiryDto);
	}

	@GetMapping("/employee-inquiry/{employeeId}")
	public List<InquiryEmployeeDto> getEmployee(@PathVariable Long employeeId) {
		return inquiryService.editInquiryInquiryDto(employeeId);
	}
}