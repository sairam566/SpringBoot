package com.tsr.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource(value = "classpath:db.properties")
@EnableJpaRepositories(basePackages = {"com.tsr.dao"})
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.tsr"})
public class JavaConfig {
	
	@Autowired
	private Environment environment;
	
	@Bean
	public DriverManagerDataSource createDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource(environment.getProperty("url"), environment.getProperty("usr"), environment.getProperty("pwd"));
		dataSource.setDriverClassName(environment.getProperty("driverClassName"));
		return dataSource;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean = null;  
	    HibernateJpaVendorAdapter jpaAdapter = null;
	    
	    jpaAdapter = new HibernateJpaVendorAdapter();
	    jpaAdapter.setShowSql(true);
	    jpaAdapter.setGenerateDdl(true);
	    
	    localContainerEntityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
	    localContainerEntityManagerFactoryBean.setDataSource(dataSource);
	    localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaAdapter);
	    localContainerEntityManagerFactoryBean.setPackagesToScan("com.tsr.entities");
	    return localContainerEntityManagerFactoryBean;
	}

	@Bean(name = "transactionManager")
	public PlatformTransactionManager platformTransactionManager(EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
}
