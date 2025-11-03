package com.amodit.java_operators;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		int a= 50, b= 30;
		System.out.println("Mathematical operators: ");
		int x = -a * -b ;
		int y = a * b ;
		int z = -a * b;
		int p = a * -b;
		int q = -a / -b ;
		int r = a /b ;
		int s = -a /b;
		int t = a / -b ;
		int u = a % b ;
		int v = -a % -b ;
		int w = -a % b;
		int d = a % -b;
		System.out.println("x :"+x); // 1500
		System.out.println("y :"+y); // 1500
		System.out.println("z :"+z); //-1500
		System.out.println("p :"+p); // -1500
		System.out.println("q :"+q); // 1
		System.out.println("r :"+r); // 1
		System.out.println("s :"+s); // -1
		System.out.println("t :"+t); // -1
		System.out.println("u :"+u); // 20
		System.out.println("v :"+v); // -20
		System.out.println("w :"+w); // -20
		System.out.println("d :"+d); // 20

	}

}
