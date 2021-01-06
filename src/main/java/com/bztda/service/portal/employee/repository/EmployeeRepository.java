package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.lang.NonNullApi;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

	List<Employee> findAllByDepartmentDepartment(String department);

	@NonNull
	List<Employee> findAll();

	Employee findByEmail(String email);

}
