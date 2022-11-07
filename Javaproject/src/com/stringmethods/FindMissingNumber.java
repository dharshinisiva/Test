package com.stringmethods;

import java.util.Scanner;

public class FindMissingNumber {
	public static int missingNumber(int n) {
		int missingnum = 0, sum = 0;
		int sumOfNum = (n * (n + 1)) / 2;
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[n - 1];
		for (int i = 0; i < array.length; i++) {
			System.out.println("please enter the numbers");
			array[i] = scanner.nextInt();
			sum = sum + array[i];
		}
		missingnum = sumOfNum - sum;
		return missingnum;
	}

	public static void main(String[] args) {
		System.out.println("Missing Number " + missingNumber(10));
	}
}
