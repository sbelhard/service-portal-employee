package com.bztda.service.portal.employee.security;

import net.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	private static final String PAGE_HOME = "/create-default-page";
	private static final String PAGE_INTERVIEW = "";
	private static final String PAGE = "";

	private UserDetailsService userDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeRequests()
				.antMatchers("/registration").not().fullyAuthenticated()
				.antMatchers(PAGE_HOME).hasAuthority("ADMIN")
				.antMatchers(PAGE_HOME).hasAuthority("USER")
				.anyRequest().permitAll()
				.and()
				.formLogin()
				.loginPage("/login")
				.failureUrl("/login-error")
				.defaultSuccessUrl("/")
				.and()
				.logout()
				.deleteCookies("JSESSIONID");
	}

	@Override
	protected UserDetailsService userDetailsService() {
		return super.userDetailsService();
	}

}
