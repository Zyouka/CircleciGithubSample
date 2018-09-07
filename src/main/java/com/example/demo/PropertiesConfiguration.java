package com.example.demo;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfiguration {

	@Bean
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource sqlDataSource() {
		return DataSourceBuilder.create().build();
	}

}
