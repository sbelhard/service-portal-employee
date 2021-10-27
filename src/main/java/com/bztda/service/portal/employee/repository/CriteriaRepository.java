package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Criteria;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CriteriaRepository extends PagingAndSortingRepository<Criteria, Long> {

    List<Criteria> findAllByOverallCriteriaCriteriaOverallCriteria(String overallCriteriaCriteria);

    @NonNull
    List<Criteria> findAll();

}
