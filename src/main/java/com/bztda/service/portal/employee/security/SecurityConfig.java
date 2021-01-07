package com.bztda.service.portal.employee.security;

import com.bztda.service.portal.employee.entity.Evaluation;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {

	private final UserDetailsService userDetailsService;

	private static final String PAGE_INTERVIEW = "/interview";
	private static final String PAGE_DEFAULT_EVALUATION = "/evaluation";
	private static final String PAGE_DEPARTMENT = "/department";
	private static final String PAGE_OVERALLCRITERIA = "/overallcriteria";
	private static final String PAGE_CRITERIA = "/criteria";
	private static final String PAGE_STAFF_EVALUATION = "/staff-evaluation";
	private static final String PAGE_DEFAULT = "/";

	private static final String PAGE_LOGIN = "";

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.cors()
				.and()
				.authorizeRequests()
				.antMatchers().permitAll()
				.antMatchers(
						PAGE_DEFAULT_EVALUATION + PAGE_OVERALLCRITERIA,
						PAGE_DEFAULT_EVALUATION + PAGE_CRITERIA, PAGE_DEFAULT_EVALUATION + PAGE_OVERALLCRITERIA,
						PAGE_DEFAULT_EVALUATION + PAGE_STAFF_EVALUATION)
				.hasAuthority("ADMIN")
				.antMatchers()
				.hasAuthority("USER")
				.and()
				.formLogin()
				.loginPage("/login")
				.defaultSuccessUrl("/")
				.and()
				.logout()
				.deleteCookies("JSESSIONID");

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public DaoAuthenticationProvider authProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
		authProvider.setUserDetailsService(userDetailsService);
		authProvider.setPasswordEncoder(passwordEncoder());
		return authProvider;
	}

	@Override
	protected UserDetailsService userDetailsService() {
		return super.userDetailsService();
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
				.allowedOrigins("*")
				.allowedMethods("*");
	}
}
