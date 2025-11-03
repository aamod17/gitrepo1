package com.amodit.control_flow;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		   System.out.println("Enter your total marks of 5 subjects:");
		   int totalMarks = sc.nextInt();
		   	
		   float myPer = totalMarks/5;
		   System.out.println("Percentage is: " +myPer);

		// Applying if-else if ladder statements.
		   if (myPer >= 90.0) {
		      System.out.print("Grade A");
		      if(true) {
		    	  
		      }
		   }
		   else if(myPer >= 80.0) {
		      System.out.print("Grade B");
		   }
		   else if(myPer >= 70.0)
		      System.out.print("Grade C");
		   else if(myPer >= 60.0)
		      System.out.print("Grade D");
		  

	}

}
