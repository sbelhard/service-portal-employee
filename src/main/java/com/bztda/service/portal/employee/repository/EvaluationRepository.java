package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Evaluation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EvaluationRepository extends PagingAndSortingRepository<Evaluation, Long> {

}
