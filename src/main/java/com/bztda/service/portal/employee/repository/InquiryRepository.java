package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.entity.Inquiry;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
public interface InquiryRepository extends PagingAndSortingRepository<Inquiry, Long> {

	List<Inquiry> findAllByEmployee(Employee employee);

	@Modifying
	@Transactional
	@Query("update DataEmployee1C d set  d.isEmployee=?1 where d.numberPass=?2")
	void update(boolean isEmployee, String numberPass);

}
