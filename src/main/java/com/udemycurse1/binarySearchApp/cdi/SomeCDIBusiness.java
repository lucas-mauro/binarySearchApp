package com.udemycurse1.binarySearchApp.cdi;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class SomeCDIBusiness {
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
	
}
