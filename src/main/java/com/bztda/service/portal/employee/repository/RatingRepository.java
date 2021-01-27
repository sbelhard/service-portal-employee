package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.entity.Rating;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RatingRepository extends PagingAndSortingRepository<Rating, Long> {

	Rating findByEmployeeId(Long id);

}
