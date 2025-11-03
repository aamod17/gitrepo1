// print the alphabetical equilateral triangle

package com.amodit.control_flow;

public class ForLoopDemo6 {

	public static void main(String[] args) {
		
		int k = 65;
		for(int i = 65; i<=69; i+=2) {
			for(int j = 69; j>=65; j--) {
				char alphabet = (char) k;
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print(alphabet+" ");	
					k++;
				}
				
			}
			System.out.println();
		}

	}

}
