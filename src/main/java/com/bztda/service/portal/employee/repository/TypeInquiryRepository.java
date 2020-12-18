package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.TypeInquiry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TypeInquiryRepository extends PagingAndSortingRepository<TypeInquiry, Long> {

}
