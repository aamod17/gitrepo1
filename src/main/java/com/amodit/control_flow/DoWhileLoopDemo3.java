package com.amodit.control_flow;

public class DoWhileLoopDemo3 {

	public static void main(String[] args) {
		
		int i = 1;
		do {
			int j = 1;
			do {
				System.out.print("* ");
				j++;
			}while(i >=j);
			System.out.println(" ");
			i++;
		}while(i <= 5);

	}

}
