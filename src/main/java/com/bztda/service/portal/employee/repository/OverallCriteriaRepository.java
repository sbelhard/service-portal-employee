package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.OverallCriteria;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OverallCriteriaRepository extends PagingAndSortingRepository<OverallCriteria, Long> {

    @NonNull
    List<OverallCriteria> findAll();

}
