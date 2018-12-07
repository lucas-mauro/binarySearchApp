package com.udemycurse1.bynarySearchApp.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.udemycurse1.binarySearchApp.basic.BinarySearchImpl;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(locations="/testContext.xml")
public class BinarySearchXMLConfigurationTest {
	
	//Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void testBasicScenario() {
		//Call method on binarySearch
		int actualResult = binarySearchImpl.binarySearch(new int[] {}, 5);
		//Check if the value is correct
		assertEquals(3, actualResult);
	}

}
