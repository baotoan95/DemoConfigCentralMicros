package com.btit95.exercise.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btit95.exercise.models.Configuration;
import com.btit95.exercise.repositories.ConfigurationRepository;

@Service
public class ConfigurationService {
	@Autowired
	private ConfigurationRepository configurationRepository;
	
	public List<Configuration> getConfiguration(String application, String profile) {
		return configurationRepository.findByApplicationInAndProfileIn(Arrays.asList(application), Arrays.asList(profile));
	}
}
