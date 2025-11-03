package com.amodit.control_flow;

public class DoWhileLoopDemo1 {

	public static void main(String[] args) {
		/*
		int num = 1;
		do {
			System.out.println(num);
			num++;
		}while(num <=5);
		*/
		
		int num1 = 1;
		System.out.println("Multiplication Table: ");
		do {
			int num2 =1;
			do {
				
				System.out.print("  "+num1 * num2);
				//System.out.printf("%4d", num1* num2);
				num2++;
			}while(num2 <=5);
			System.out.println();
			num1++;
		}while(num1 <= 5);

	}

}
