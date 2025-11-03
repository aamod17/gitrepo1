package com.amodit.control_flow;

import java.util.Scanner;

public class DoWhileLoopDemo2 {

	public static void main(String[] args) {
		
		Scanner scanner = null;
		Integer num, sum ;
		sum = 0;
		try {
			scanner = new Scanner(System.in);
			do {
				System.out.println("Enter an Integer Number: ");
				num = scanner.nextInt();
				sum = sum + num;
			}while(num != 0);
			System.out.println("Sum of the given numbers are: "+sum);
		}catch(RuntimeException exception) {
			exception.printStackTrace();
		}

	}

}
