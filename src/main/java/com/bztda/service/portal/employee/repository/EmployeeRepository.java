package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}
