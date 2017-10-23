package com.btit95.exercise.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ConfigResponseDto {
	private String name;
	private List<String> profiles;
	private String label;
    private String version;
    private String state;
    private List<PropertySourcesDto> propertySources;
}
