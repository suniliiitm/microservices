package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEmployeeServiceApplication.class, args);
	}

}
