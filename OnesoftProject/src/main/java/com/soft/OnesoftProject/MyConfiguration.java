package com.soft.OnesoftProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AndRequestMatcher;

@EnableWebSecurity
@Configuration
public class MyConfiguration extends WebSecurityConfigurerAdapter{

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Nisha").password("$2a$10$kPoNZbwzc3BwU2DVhFJVn.jLyAd/a1dltv6VO9D.MaJpleKQO4/lK").roles("gettrainers").
		and().withUser("Mouri").password("$2a$10$wa0eRvze7Y0WXl2SFfdViOgcurggwacl6dmJT9UVyjngP/b/o5hPW").roles("getstudents").and().withUser("Prakash").password("$2a$10$1MQSt47Wqozoilaidgrl3uHPY4TmP2D7QzJsUvSf8wXmQDZ75lZDe").roles("getManagers");
	}
	
//	@Bean
//	public PasswordEncoder getPass() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	
	@Bean
	public PasswordEncoder getEncryptPass() {
		return new BCryptPasswordEncoder(10);
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/getManagers").hasRole("getManagers");
		http.authorizeRequests().antMatchers("/gettrainers").hasAnyRole("gettrainers","getManagers");
		http.authorizeRequests().antMatchers("/getstudents").hasAnyRole("getstudents","gettrainers","getManagers").and().formLogin();
//		http.authorizeRequests().antMatchers("/getstudents").permitAll().and().formLogin();
	}
}