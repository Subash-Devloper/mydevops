package com.MyDevops.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DevopsController {
	@GetMapping(value="get")
	public String get() {
		return "Onnum illa close pannidunga"; 
	}

}
