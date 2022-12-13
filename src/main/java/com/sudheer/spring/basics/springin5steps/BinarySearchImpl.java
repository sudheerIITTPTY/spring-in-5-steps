package com.sudheer.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	private SortAlgo sortAlgo;

	public BinarySearchImpl(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}



	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgo.sort(numbers);
		System.out.println("Used SortAlgorithm : " + sortAlgo);
		return numberToSearchFor;
	}

}
