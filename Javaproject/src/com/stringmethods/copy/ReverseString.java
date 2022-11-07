package com.stringmethods.copy;

public class ReverseString {
	public static String reversecountry(String input) {

		char array[] = input.toCharArray();
		String reversedString = "";
		for (int i = array.length - 1; i > 0; i--) {
			reversedString = reversedString + array[i];

		}
		return reversedString;
	}

	public static void main(String[] args) {
		String reverse = reversecountry("india");
		System.out.println(reverse);

	}
}