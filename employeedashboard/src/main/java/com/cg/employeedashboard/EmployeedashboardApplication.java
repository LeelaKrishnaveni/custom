package com.cg.employeedashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class EmployeedashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeedashboardApplication.class, args);
	}

}
