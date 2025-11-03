// print a numeric equilateral traingle

package com.amodit.control_flow;

public class ForLoopDemo7 {

	public static void main(String[] args) {
		
		int k = 1;
		for(int i =1 ; i<=5; i+=2) {
			for(int j = 5; j >=1; j--) {
				if(j > i) {
					System.out.print(" ");
				}else {
					System.out.print(k+" ");
					k++;
				}
			}
			System.out.println();
		}

	}

}
