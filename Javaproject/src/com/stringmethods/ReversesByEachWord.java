package com.stringmethods;

public class ReversesByEachWord {
	public static String reversesEachWord(String word) {
		String result = "";
		String[] array = word.split(" ");
		for (int i = 0; i <=  array.length; i++) {
			String reversWord = ReverseString.reversecountry(array[i]);
			result = result + reversWord.concat(" ");
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String newSentence = reversesEachWord("India s y country");
		System.out.println(newSentence);

	}

}
