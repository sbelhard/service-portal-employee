package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Employee;
import com.bztda.service.portal.employee.entity.Rating;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;


@Repository
public interface RatingRepository extends PagingAndSortingRepository<Rating, Long> {

	/*@Modifying
	@Query("select Rating  FROM Rating r where r.employee.id=?1")
	Rating findByEmployeeId(Long id);*/

	@Modifying
	@Query("update Rating r set r.rating=?1")
	void update(Long rating);

}
