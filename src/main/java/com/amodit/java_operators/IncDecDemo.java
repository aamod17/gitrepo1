package com.amodit.java_operators;

public class IncDecDemo {

	public static void main(String[] args) {
		
		int x = 10;
		int m = ++x * x++ ;
		
		System.out.println("x: "+x);//12
		System.out.println("m: "+m); // 121
		

	}

}
