package com.sp.empConsumer;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProfileRestConsumer {
	
	@Autowired
	private DiscoveryClient dClient;
	
	public String getProfileData() {
		//get List<SI> using Profile Service id
		List<ServiceInstance>list= dClient.getInstances("PROFILE_PRODUCER");
		//read single instance based on index
		ServiceInstance si =list.get(0);
		
		 //read uri and PATH
		String url= si.getUri()+"/profile/data";
		 
		//Use RestTemplate object
		RestTemplate rt= new RestTemplate();
	    String response	=rt.getForObject(url, String.class);
		return response;
	}

}
