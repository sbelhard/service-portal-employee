package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Education;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducationRepository extends PagingAndSortingRepository<Education, Long> {

	Education findByEducation(String education);

}
