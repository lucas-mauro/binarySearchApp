package com.udemycurse1.binarySearchApp.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		// Logic for Quick Sort
		return numbers;
	}
	
}
 