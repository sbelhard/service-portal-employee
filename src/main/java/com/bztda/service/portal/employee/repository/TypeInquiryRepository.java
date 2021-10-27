package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.TypeInquiry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TypeInquiryRepository extends PagingAndSortingRepository<TypeInquiry, Long> {

	@NonNull
	List<TypeInquiry> findAll();

}
