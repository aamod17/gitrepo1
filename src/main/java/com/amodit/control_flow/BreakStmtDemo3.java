package com.amodit.control_flow;

public class BreakStmtDemo3 {

	public static void main(String[] args) {
		
		int i =1;
		while(i<=5) {
			if(i == 5) {
				System.out.println("inside the if block at i= "+i);
				i++;
				break;
			}
			
			System.out.println(i);
			i++;
			
		}
		System.out.println("Exit from while loop");

	}

}
