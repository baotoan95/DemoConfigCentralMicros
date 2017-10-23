package com.btit95.exercise.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.btit95.exercise.dto.ConfigResponseDto;
import com.btit95.exercise.dto.PropertySourcesDto;
import com.btit95.exercise.models.Configuration;
import com.btit95.exercise.services.ConfigurationService;

@RestController
public class ConfigController {
	@Autowired
	private ConfigurationService configurationService;
	
	@GetMapping("configurations/{profileName}")
	public ConfigResponseDto configurations(@PathVariable String profileName) {
		ConfigResponseDto configResponseDto = new ConfigResponseDto();
		if(!profileName.isEmpty()) {
			List<Configuration> configurations = configurationService.getConfiguration("customer-management", profileName);
			
			Map<String, String> source = new HashMap<>();
			configurations.forEach(config -> source.put(config.getKey(), config.getValue()));
			
			PropertySourcesDto propertySourcesDto = new PropertySourcesDto(profileName, source);
			configResponseDto.setName("configurations");
			configResponseDto.setProfiles(Arrays.asList(profileName));
			configResponseDto.setPropertySources(Arrays.asList(propertySourcesDto));
		}
		
		return configResponseDto;
	}
}
