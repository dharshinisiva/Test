package com.methods;

public class FibnacciEx {
	public static void fibnacci() {
		int n1 = 0, n2 = 1, count = 10, sum;
		for (int i = 0; i <= 10; i++) {
			System.out.println(n1);
			sum = n1 + n2;
			n1 = n2;

			n2 = sum;

		}
	}

	public static void main(String args[]) {
		fibnacci();
	}

}
