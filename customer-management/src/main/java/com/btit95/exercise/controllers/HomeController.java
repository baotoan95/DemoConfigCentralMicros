package com.btit95.exercise.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HomeController {
	@Value("${customer-management.name:Default}")
	private String name;
	@Value("${spring.cloud.config.uri}")
	private String configServerUri;
	
	@GetMapping("customer")
	public String customer() {
		return name;
	}
}
