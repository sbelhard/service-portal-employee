package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.TestPostMethod;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestPostMethodRepository extends PagingAndSortingRepository<TestPostMethod, Long> {
}
