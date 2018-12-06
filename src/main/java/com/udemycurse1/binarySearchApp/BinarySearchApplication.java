package com.udemycurse1.binarySearchApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemycurse1.binarySearchApp.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class BinarySearchApplication {

	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(BinarySearchApplication.class)){
				//SpringApplication.run(BinarySearchApplication.class, args);
		BinarySearchImpl binarySearch = 
				applicationContext.getBean(BinarySearchImpl.class);
		int result =
				binarySearch.binarySearch(new int[] {12,5,6},3);
		System.out.println(result);
		applicationContext.close();
		}
		
	}
}
