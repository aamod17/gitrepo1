package com.amodit.control_flow;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		
		
		char city= 'e';
		switch(city) {
		
		case 'a': System.out.println("Mumbai");
		break;
		
		case 'b': System.out.println("Ranchi");
		break;
		
		case 'c': System.out.println("Karnatka");
		break;
		
		default: System.out.println("No city Seleceted");
		
		
		}
		System.out.println("exit from the switch-case");

	}

}
