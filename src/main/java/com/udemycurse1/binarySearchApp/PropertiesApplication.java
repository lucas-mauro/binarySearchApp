package com.udemycurse1.binarySearchApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.udemycurse1.binarySearchApp.basic.BinarySearchImpl;
import com.udemycurse1.binarySearchApp.properties.SomeEternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(PropertiesApplication.class)){
				//SpringApplication.run(BinarySearchApplication.class, args);
		SomeEternalService service = 
				applicationContext.getBean(SomeEternalService.class);
		
		System.out.println(service.returnServiceURL());
		
		}
		
	}
}
