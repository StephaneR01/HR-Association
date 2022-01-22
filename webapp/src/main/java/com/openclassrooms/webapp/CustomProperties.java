package com.openclassrooms.webapp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//import lombok.Data;

//@Data
@Configuration
@ConfigurationProperties(prefix="com.openclassrooms.webapp")
public class CustomProperties {

	private String apiUrl;
	
	public String getApiUrl() {
		return apiUrl;
	}
	
	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
}
