package com.udemycurse1.binarySearchApp.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class SomeEternalService {
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceURL() {
		return url;
	}
}
