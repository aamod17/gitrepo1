package com.amodit.control_flow;

public class ForEachLoopDemo8 {

	public static void main(String[] args) {
		
		int[] numarr = {10,20,30,40,50};
		
		/*for(int i = 0; i<5; i++) {
			if(numarr[i] > 8 && numarr[i] < 55 ) {
				System.out.println(numarr[i]);
			}
		}
		*/
		// same code with for each loop
		
		for(int num : numarr) {
			if(num > 8 && num < 55) {
				System.out.println(num);
			}
		}

	}

}
