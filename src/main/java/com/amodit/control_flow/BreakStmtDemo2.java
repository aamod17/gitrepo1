package com.amodit.control_flow;

public class BreakStmtDemo2 {

	public static void main(String[] args) {
		
		for(int i= 1; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				if(i == j) {
					break;// not printed numbers: 11 22 33 44 55
				}
				System.out.println(i +" * "+j);
			}
			System.out.println("Exit from the Inner for loop");
		}
		System.out.println("exit from outer loop");

	}

}
