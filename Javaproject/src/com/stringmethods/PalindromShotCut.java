package com.stringmethods;

public class PalindromShotCut {
	public static boolean ispalindrom(String name) {
		int starIndex = 0, endIndex = name.length() - 1;
		for (int i = 0; i < name.length() / 2; i++) {
			char first = name.charAt(i);
			char second = name.charAt(endIndex--);
			if (first == second)
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		boolean palindrom = ispalindrom("madam");
		if (palindrom) {
			System.out.println("given name is palindrome");

		} else {
			System.out.println("given name is not palindrome");
		}

	}

}
