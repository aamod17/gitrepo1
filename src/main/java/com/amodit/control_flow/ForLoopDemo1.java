// print the right angled triangle
package com.amodit.control_flow;

public class ForLoopDemo1 {

	public static void main(String[] args) {
		
		for(int i = 1; i <=5; i++) {
			for(int j= 1; j<=i; j++) {
				System.out.print("*");
				//System.out.println("* "); //provide space between two horizontal stars.
			}
			System.out.println();
		}

	}

}
