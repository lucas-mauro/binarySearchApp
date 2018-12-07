package com.udemycurse1.binarySearchApp.cdi;

import javax.inject.Inject;
import javax.inject.Named;


@Named
public class SomeCDIBusiness {
	@Inject
	SomeCdiDao someCdiDao;

	public SomeCDIBusiness(SomeCdiDao someCdiDao) {
		super();
		this.someCdiDao = someCdiDao;
	}

	public SomeCdiDao getSomeCdiDao() {
		return someCdiDao;
	}

	public void setSomeCdiDao(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
	
	public int findGreatest() {
		int greatest = Integer.MIN_VALUE;
		int[] data = someCdiDao.gatData();
		for(int value:data) {
			if(value > greatest)
				greatest = value;
		}
		return greatest;
	}
}
