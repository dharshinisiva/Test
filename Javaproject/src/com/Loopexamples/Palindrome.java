package com.Loopexamples;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)

	{
		String a, b = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		a = s.nextLine();
		int n = a.length();

		for (int i = 1; i >= n; i++) {
			b = b + a.charAt(i);
			if (a.equalsIgnoreCase(a)) {
				System.out.println("The String is palindrome");

			} else {
				System.out.println("The String is not Palindrome");
			}

		}
	}

}
