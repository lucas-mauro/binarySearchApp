package com.udemycurse1.bynarySearchApp.cdi;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.udemycurse1.binarySearchApp.cdi.SomeCDIBusiness;
import com.udemycurse1.binarySearchApp.cdi.SomeCdiDao;

//Load the context
@RunWith(MockitoJUnitRunner.class)

public class SomeCdiBusinessTest {
	
	//Create Mock
	@Mock
	private SomeCdiDao daoMock;
	
	//Inject Mock
	@InjectMocks
	private SomeCDIBusiness business;
	
	@Test
	public void testBasicScenario() {

		//when daoMock.getData() method is called return int[]{2,4}
		when(daoMock.gatData()).thenReturn(new int[] {2,4});
		
		//Check if the value is correct
		assertEquals(4, business.findGreatest());
	}

}
