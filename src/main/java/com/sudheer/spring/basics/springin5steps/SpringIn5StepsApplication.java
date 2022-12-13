package com.sudheer.spring.basics.springin5steps;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		BubbleSortAlgo bubbleSortAlgo = new BubbleSortAlgo();
		QuickSortAlgo quickSortAlgo = new QuickSortAlgo();
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(bubbleSortAlgo);
		int result = binarySearchImpl.binarySearch(new int[] {1,2,3,4}, 3);
		
		BinarySearchImpl binarySearchImpl2 = new BinarySearchImpl(quickSortAlgo);
		int result2 = binarySearchImpl2.binarySearch(new int[] {1,2,3,4}, 3);
		
		System.out.println("Result :" + result);
		System.out.println("Result2 :" + result2);
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
