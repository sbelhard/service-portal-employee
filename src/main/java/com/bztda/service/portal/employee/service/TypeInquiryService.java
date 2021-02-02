package com.bztda.service.portal.employee.service;

import com.bztda.service.portal.employee.dto.TypeInquiryDto;
import com.bztda.service.portal.employee.entity.TypeInquiry;
import com.bztda.service.portal.employee.repository.TypeInquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TypeInquiryService {

	@Autowired
	private TypeInquiryRepository typeInquiryRepository;

	public List<TypeInquiryDto> getAllTypeInquiry() {
		List<TypeInquiry> typeInquiries = typeInquiryRepository.findAll();
		List<TypeInquiryDto> typeInquiryDtos = new ArrayList<>();
		for (TypeInquiry typeInquiry : typeInquiries) {
			typeInquiryDtos.add(TypeInquiryDto.builder()
					.id(typeInquiry.getId())
					.type(typeInquiry.getType())
					.build());
		}
		return typeInquiryDtos;
	}

}
