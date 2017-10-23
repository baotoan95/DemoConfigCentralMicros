package com.btit95.exercise.dto;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PropertySourcesDto {
	private String name;

    private Map<String, String> source;

    public PropertySourcesDto(String name, Map<String, String> source) {
        this.name = name;
        this.source = source;
    }
}
