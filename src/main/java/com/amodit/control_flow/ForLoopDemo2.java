// find the sum of an array elements
package com.amodit.control_flow;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		
		// 1. declaring integer arrays in one line
		//int[] numbers = {1,2,3,4,5};
		
		// 2. declare, create, and initialize and arrays
		int[] x ;
		x = new int[4];
		x[0] = 1;
		x[1] = 2;
		x[2] = 3;
		x[3] = 4;
		/*
		// 3. declare, create, and initialize and arrays
		int[] y = new int[5];
		y[0] = 1;
		y[1] = 2;
		y[2] = 3;
		y[3] = 4;
		y[4] = 5;
		*/
		int sum = 0;
		// finding sum of an arrays by using for loop
		/*for(int i = 1; i<= x.length; i++) {
			//sum = sum + i;
			sum += i;
		}
		System.out.println("Sum: "+sum);
		*/
		
		// finding the sum using for each loop
		for(int num : x) {
			sum += num;
		}
		System.out.println("Sum: "+sum);

	}

}
