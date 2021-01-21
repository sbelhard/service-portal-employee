package com.bztda.service.portal.employee;

import com.bztda.service.portal.employee.dto.EmployeeLoginDto;
import com.bztda.service.portal.employee.dto.LoginDto;
import com.bztda.service.portal.employee.repository.EmployeeRepository;
import com.bztda.service.portal.employee.service.EmployeeService;
import com.bztda.service.portal.employee.service.LoginService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;


@SpringBootTest
class EmployeeServicePortalApplicationTests {

}
