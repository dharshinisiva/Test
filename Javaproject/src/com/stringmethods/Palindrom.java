package com.stringmethods;

public class Palindrom {
	public static boolean palindrom(String name) {
		String reversename = ReverseString.reversecountry(name);
		if (name.equals(reversename)) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ispalindrom = palindrom("madam");
		if (ispalindrom) {
			System.out.println("is palindrome");
		} else {
			System.out.println("is not palindrome");
		}

	}

}