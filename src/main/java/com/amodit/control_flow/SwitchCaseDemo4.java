// display the name of day in the week in Java using switch case statement

package com.amodit.control_flow;

public class SwitchCaseDemo4 {

	public static void main(String[] args) {
		
		int i = 6;
		String name;
		
		switch(i) {
		
		case 1: name = "Monday";
		break;
		
		case 2: name = "Tuesday";
		break;
		
		case 3: name = "Wednesday";
		break;
		
		case 4: name = "Thursday";
		break;
		
		case 5: name = "Friday";
		break;
		
		case 6: name = "Saturday";
		break;
		
		case 7: name = "Sunday";
		break;
		
		default: name = "Invaild day";
		
		}
		System.out.println("Today is "+name);
		

	}

}
