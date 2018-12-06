package com.udemycurse1.binarySearchApp.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.udemycurse1.binarySearchApp.ScopeApplication;
import com.udemycurse1.binarySearchApp.basic.SortAlgorithm;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {
	
	//private static Logger logger = 
		//	LoggerFactory.getLogger(ScopeApplication.class);
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] numbers, int number) {
		numbers = sortAlgorithm.sort(numbers);
		return 3;
	}
	
	@PostConstruct
	public void postConstructor() {
		//logger.info("postConstructor");
	}
	
	@PreDestroy
	public void preDestroy() {
		//logger.info("postDestroy");
	}
}
