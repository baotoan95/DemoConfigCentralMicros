package com.btit95.exercise.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.btit95.exercise.models.Configuration;

public interface ConfigurationRepository extends CrudRepository<Configuration, UUID> {
	List<Configuration> findByApplicationInAndProfileIn(List<String> applications, List<String> profileNames);
}
