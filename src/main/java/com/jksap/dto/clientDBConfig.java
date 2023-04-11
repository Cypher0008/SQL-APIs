package com.jksap.dto;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
		basePackages = "com.jksap.dto",
		entityManagerFactoryRef = "entityManagerFactory",transactionManagerRef = "transcationManager" )

public class clientDBConfig {
	@Primary
	@Bean(name="dataSource")
	
	@ConfigurationProperties(prefix="spring.client.datasource")
	public DataSource dataSource()
	{
		return DataSourceBuilder.create().build();
	}
	
	@Primary
	@Bean(name="entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(@Qualifier("dataSource") DataSource dataSource,EntityManagerFactoryBuilder builder)
	{
		Map<String,Object> properties=new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto","update");
		properties.put("hibernate.dailect","org.hibernate.dialect.SQLServer2012Dialect");
		return builder.dataSource(dataSource)
				.properties(properties)
				.packages("com.jksap.dto")
				
				.build();
	}
	
	
	@Primary
	@Bean(name="transcationManager")
   public PlatformTransactionManager transcationManager(@Qualifier("entityManagerFactory") EntityManagerFactory factory)
   {
		return new JpaTransactionManager(factory);
   }

}