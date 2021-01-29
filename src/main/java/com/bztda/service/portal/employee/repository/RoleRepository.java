package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role, Long> {

	Role findByRole(String role);

}
