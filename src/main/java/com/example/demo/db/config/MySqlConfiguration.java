package com.example.demo.db.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.TransactionManager;

import lombok.extern.slf4j.Slf4j;

@Configuration
@EnableJpaRepositories(basePackages = { "com.example.demo.db.repository" })
@Slf4j
public class MySqlConfiguration {
	
	@Value("${spring.datasource.driver.class}")
	String className;
	@Value("${spring.datasource.url}")
	String url;
	@Value("${spring.datasource.username}")
	String user;
	@Value("${spring.datasource.password}")
	String password;

	@Bean
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		factory.setPackagesToScan("com.example.demo.db.entity");
		factory.setDataSource(dataSource());
		factory.afterPropertiesSet();

		return factory.getObject();
	}

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(className);
		dataSource.setUrl(url);
		dataSource.setUsername(user);
		dataSource.setPassword(password);

		return dataSource;
	}
	
	@Bean
	public TransactionManager transactionManager() {
	  DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
	  transactionManager.setDataSource(dataSource());
	 
	  return transactionManager;
	}
}
