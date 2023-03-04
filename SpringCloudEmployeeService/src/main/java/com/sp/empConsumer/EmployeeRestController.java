package com.sp.empConsumer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeRestController {
	
	@Autowired
	private ProfileRestConsumer prconsumer;
	
	@GetMapping("/emp")
	public String empServiceData() {
		
		return "From Employee Service data"+prconsumer.getProfileData();
	}
	@GetMapping("/e1")
	public String empServiceData1() {
		
		return "From Employee Service data";
	}
}
