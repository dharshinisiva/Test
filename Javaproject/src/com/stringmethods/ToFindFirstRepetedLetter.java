package com.stringmethods;

public class ToFindFirstRepetedLetter {
	public static char findrepetedletter(String letter) {
		char[] name = letter.toCharArray();
		for (int i = 0; i < name.length; i++) {
			for (int j = i + 1; j < name.length; j++) {

				if (name[i] == name[j]) {
					return name[i];
				}
			}

		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(findrepetedletter("geeksforgeeks"));

	}

}