package com.methods;

public class FactorialEx {
	public static int factorial(int Number) {
		int fact = 1;
		for (int i = 1; i <= Number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String args[]) {

		int total = factorial(5);
		System.out.println(total);
	}

}
