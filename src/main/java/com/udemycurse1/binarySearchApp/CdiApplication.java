package com.udemycurse1.binarySearchApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.udemycurse1.binarySearchApp.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class CdiApplication {
	private static Logger LOGGER = 
			LoggerFactory.getLogger(CdiApplication.class);
			
	public static void main(String[] args) {
		//ApplicationContext applicationContext =
			//	SpringApplication.run(CdiApplication.class, args);
		try(AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(CdiApplication.class))
		{
			SomeCDIBusiness someCDIBusiness = 
					applicationContext.getBean(SomeCDIBusiness.class);
			
			LOGGER.info("{} dao.{}",someCDIBusiness, someCDIBusiness.getSomeCdiDao());
		}
	}
}
