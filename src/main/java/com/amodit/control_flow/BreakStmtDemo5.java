// search an element within an array using break statement

package com.amodit.control_flow;

import java.util.Scanner;

public class BreakStmtDemo5 {

	public static void main(String[] args) {
		
		Scanner scanner;
		Boolean value = false;
		Integer inputNum;
		try {
			scanner = new Scanner(System.in);
			System.out.print("Enter an Integer: ");
			inputNum = scanner.nextInt();
			Integer[] intArr = {10,20,30,40,50};
			
			for(Integer num : intArr) {
				if(num == inputNum) {
					value = true;
					break;
				}
			}
			if(value) {
				System.out.println("Number "+inputNum+" found in Array");
			}else {
				System.out.println("Number "+inputNum+" not found in Array");
			}
			
		}catch(RuntimeException exception) {
			exception.printStackTrace();
		}

	}

}
