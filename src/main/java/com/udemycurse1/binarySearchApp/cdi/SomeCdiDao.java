package com.udemycurse1.binarySearchApp.cdi;

import javax.inject.Named;


@Named
public class SomeCdiDao {
	public int[] gatData(){
		return new int[] {5, 89, 100};
	}
}
