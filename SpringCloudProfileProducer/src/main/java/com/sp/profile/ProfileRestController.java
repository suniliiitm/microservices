package com.sp.profile;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profile")
public class ProfileRestController {
	
	@GetMapping("/data")
	public String showEmpProfile() {
		return "From Profile Service";
	}

}
