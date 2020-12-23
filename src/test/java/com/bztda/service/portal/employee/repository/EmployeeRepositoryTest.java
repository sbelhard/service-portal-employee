package com.bztda.service.portal.employee.repository;

import com.bztda.service.portal.employee.entity.Evaluation;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
public class EmployeeRepositoryTest {

	@MockBean
	private EmployeeRepository employeeRepository;

}