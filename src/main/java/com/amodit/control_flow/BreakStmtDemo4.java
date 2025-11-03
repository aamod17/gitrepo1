package com.amodit.control_flow;

public class BreakStmtDemo4 {

	public static void main(String[] args) {
		
		int i =1;
		do {
			if(i == 5) {
				System.out.println("enter the if block at i = "+i);
				i++;
				break;
			}
			System.out.println(i);
			i++;
		}while(i <=5);
		System.out.println("Exit from do while loop");

	}

}
