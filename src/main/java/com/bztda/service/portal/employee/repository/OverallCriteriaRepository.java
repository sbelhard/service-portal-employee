package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.OverallCriteria;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OverallCriteriaRepository extends PagingAndSortingRepository<OverallCriteria, Long> {

}