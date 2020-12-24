package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Hobbies;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HobbiesRepository extends PagingAndSortingRepository<Hobbies, Long> {

}
