package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Department;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface DepartmentRepository extends PagingAndSortingRepository<Department,Long> {

}
