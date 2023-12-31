package com.jbk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Supplier_ServiceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Supplier_ServiceApiApplication.class, args);
	}

}
