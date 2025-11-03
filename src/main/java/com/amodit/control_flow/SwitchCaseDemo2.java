package com.amodit.control_flow;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SwitchCaseDemo2 {
	
	private static final Logger logger = LogManager.getLogger(SwitchCaseDemo2.class);


	public static void main(String[] args) {
		
		logger.info("application starts");
		for(int i = 0; i<6; i++) {
			logger.info("passing the value");
			switch(i) {
			
			case 0: System.out.println("Zero");
			break;
			
			case 1: System.out.println("One");
			break;
			
			case 2: System.out.println("Two");
			break;
			
			case 3: System.out.println("Three");
			break;
			
			case 4: System.out.println("Four");
			break;
			
			default: System.out.println(i+" is greater then 4");
			
			}
			logger.info("exit from the switch case");
		}
		//System.out.println("exit from for loop");
		logger.info("exit from the for-loop");

	}

}
