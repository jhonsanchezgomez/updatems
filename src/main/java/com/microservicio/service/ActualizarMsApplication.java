package com.microservicio.service;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
//import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ActualizarMsApplication {
	
	@Bean
	public DataSource datadb (DataSourceProperties ds) {
		return ds.initializeDataSourceBuilder().build();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ActualizarMsApplication.class, args);
	}

}
