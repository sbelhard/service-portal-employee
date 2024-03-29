package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.EmployeeHobbies;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeHobbiesRepository extends PagingAndSortingRepository<EmployeeHobbies, Long> {

}
