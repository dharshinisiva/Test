package com.stringmethods.copy;

public class LowerCaseUpperCase {
	public static String reverseWord(String word) {
		String result = "";
		String lowerCaseSentence = word.toLowerCase();
		String array[] = lowerCaseSentence.split(" ");
		int endindex = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			String reverseword = "";
			if (i == endindex) {
				String name = array[i];
				char[] wordarray = name.toCharArray();
				for (int k = wordarray.length - 1; k >= 0; k--) {
					reverseword = reverseword + wordarray[k];
				}
				result = result + reverseword;
			} else
				result = result + array[i].concat(" ");
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = reverseWord("T20 Worldcup Happening In Australia");
		System.out.println(sentence);
	}
}
