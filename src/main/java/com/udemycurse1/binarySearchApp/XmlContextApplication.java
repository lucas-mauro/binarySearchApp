package com.udemycurse1.binarySearchApp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemycurse1.binarySearchApp.scope.XmlPersonDAO;


public class XmlContextApplication {

	private static Logger LOGGER =
			LoggerFactory.getLogger(XmlContextApplication.class);
	public static void main(String[] args) {
		
//		try(AnnotationConfigApplicationContext applicationContext =
//				new AnnotationConfigApplicationContext(XmlContextApplication.class)){
		//		SpringApplication.run(BinarySearchApplication.class, args);
		
		try(ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml")){
				
			LOGGER.info("Beans --> {}", (Object)applicationContext.getBeanDefinitionNames());
			XmlPersonDAO personDAO =
					applicationContext.getBean(XmlPersonDAO.class);
	//		System.out.println(personDAO);
	//		System.out.println(personDAO.getXmlJdbcConnection());
			LOGGER.info("{} {}",personDAO, personDAO.getXmlJdbcConnection());
		}
		
	}
}
