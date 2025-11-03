// display the name of season occurring during the year using switch statement in Java

package com.amodit.control_flow;

public class SwitchCaseDemo5 {

	public static void main(String[] args) {
		
		/*
		String season ;
		int month = 13;
		switch(month) {
		
		case 12:
		case 1:
		case 2: season = "Winter";
		break;
		
		case 3:
		case 4:
		case 5: season = "Summer";
		break;
		
		case 6:
		case 7:
		case 8:
		case 9: season = "Monsoon";
		break;
		
		case 10:
		case 11: season = "Autumn";
		break;
		
		default: season = "provide valid month ";
		
		}
		
		System.out.println("Season : "+season);
		*/
		
		String season;
		String month= "May";
		
		switch(month) {
		
		case "January":
		case "February":
		case "December": season = "Winter";
		break;
		
		case "March":
		case "April":
		case "May"  : season = "Summer";
		break;
		
		case "June":
		case "July":
		case "August"  : season = "Summer";
		break;
		
		case "October":
		case "November": season = "Autumn";
		break;
		
		default: season = "Unknown";
		
		}
		System.out.println("Your Season is "+season);

	}

}
