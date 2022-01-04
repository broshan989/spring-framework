package com.app.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.app")
public class Config {
	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/SpringJDBC_DB");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(getDataSource());
	}
}
/*
 * JdbcTemplate needs datasource we can also inject dependency by autowiring it
 * i.e  this would also work
 * @Bean(autowire = Autowire.BY_TYPE)
 *	public JdbcTemplate getJdbcTemplate() {
 *		return new JdbcTemplate();
 *	}
 */