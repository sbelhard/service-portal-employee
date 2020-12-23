package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.entity.Evaluation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {


}
