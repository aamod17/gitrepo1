package com.amodit.control_flow;

import java.util.Scanner;

public class SwitchCaseDemo3 {

	public static void main(String[] args) {
		
		Scanner scanner ;
		Integer totalMarks;
		Integer percentage = 0;
		try {
			
			scanner = new Scanner(System.in);
			System.out.print("Enter Your Total Marks: ");
			totalMarks = scanner.nextInt();
			if(totalMarks <= 500) {
				percentage = totalMarks / 5 ;
				System.out.println("Your Percentage is : "+percentage);
				int i = percentage/10;
				switch(i) {
				case 9 : System.out.println("Grade A");
				break;
				
				case 8 : System.out.println("Grade B");
				break;
				case 7 : System.out.println("Grade C");
				break;
				case 6 : System.out.println("Grade D");
				break;
				
				case 5 : System.out.println("Pass");
				break;
				
				default : System.out.println("Fail");
				
				}
			}else {
				System.out.println("Provide valid marks");
			}
			
			
			
		}catch(RuntimeException exception) {
			exception.printStackTrace();
		}

	}

}
