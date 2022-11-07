package com.array;

import java.util.Scanner;

public class FindStringInArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int length = sc.nextInt();
		int arr[] = new int[length];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the " + i + "th index value");
			int array = sc.nextInt();
			arr[i] = array;
		}
		System.out.println("Enter The Number To Find");
		int findnum = sc.nextInt();
		
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (findnum == (arr[i])) {
				count++;
			}
		}
		System.out.println(count);

	}
}
