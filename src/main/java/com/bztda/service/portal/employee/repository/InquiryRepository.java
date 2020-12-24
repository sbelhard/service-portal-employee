package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Inquiry;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InquiryRepository extends PagingAndSortingRepository<Inquiry, Long> {

}