// print the alphabet right angled triangle

package com.amodit.control_flow;

public class ForLoopDemo5 {

	public static void main(String[] args) {
		
		/*for(int i = 65; i<=69; i++) {
			for(int j = 65; j<=i; j++) {
				char alphabet = (char)j;
				System.out.print(alphabet+" ");
			}
			System.out.println();
		}*/
		
		for(int i = 69; i>=65; i--) {
			for(int j = 65; j<=i; j++) {
				char alphabet = (char)j;
				System.out.print(alphabet+" ");
			}
			System.out.println();
		}

	}

}
