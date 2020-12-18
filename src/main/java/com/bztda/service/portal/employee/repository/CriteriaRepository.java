package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Criteria;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CriteriaRepository  extends PagingAndSortingRepository<Criteria,Long> {

}
