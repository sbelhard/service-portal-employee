package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.TestPost;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestPostRepository extends PagingAndSortingRepository<TestPost, Long> {

}
