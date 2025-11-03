package com.amodit.control_flow;

public class BreakStmtDemo1 {

	public static void main(String[] args) {
		
		for(int i =1 ; i<=5; i++) {
			if(i == 5) {
				System.out.println("inside the if block");
				break;// jump out from the loop when i =5.then it will print sop. 
			}
			System.out.println(i);
		}
		System.out.println("Exit from the For Loop");

	}

}
