package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Department;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DepartmentRepository extends PagingAndSortingRepository<Department, Long> {

    @NonNull
    List<Department> findAll();

}
