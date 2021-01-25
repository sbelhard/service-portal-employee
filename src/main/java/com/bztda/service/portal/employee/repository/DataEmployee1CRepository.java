package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.DataEmployee1C;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DataEmployee1CRepository extends PagingAndSortingRepository<DataEmployee1C, Long> {

	DataEmployee1C findByNumberPass(String numberPass);

	@Modifying
	@Query("update DataEmployee1C d set d.isEmployee=?1")
	void update(boolean isEmployee);

}
