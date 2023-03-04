package com.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProfileProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProfileProducerApplication.class, args);
	}

}
