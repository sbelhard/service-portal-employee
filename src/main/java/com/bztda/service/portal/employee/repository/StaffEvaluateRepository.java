package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.StaffEvaluate;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StaffEvaluateRepository extends PagingAndSortingRepository<StaffEvaluate, Long> {

}
