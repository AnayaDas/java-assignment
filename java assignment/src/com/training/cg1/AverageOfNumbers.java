package com.training.cg1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AverageOfNumbers {
	public static void main(String args[]) {
	List<Integer>num = Arrays.asList(10,20,30,40,50,60,70);
	Stream<Integer> stream =num.stream();
	int sum = 0; 
	for(int i : num) {
		sum+=i;
	}
	if(num.isEmpty()) {
		System.out.println("Arraylist is empty");
		
	}
	else {
		System.out.println("Average of the numbers is :"+sum/(float)num.size());
	}
}
}

