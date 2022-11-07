package com.practiceprograms;

public class doubleCodexSentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String temp = "";
		String input = "moon sun \"Jupiter is a largest planat\" pluto sateran";
		String array[] = new String[5];
		int arrayIndex = 0;
		int doublecodexcounter = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '"') {
				temp = temp + input.charAt(i);
				doublecodexcounter++;
			} else if (doublecodexcounter % 2 == 0 && input.charAt(i) == ' ') {
				array[arrayIndex++] = temp;
				temp = "";

			} else {
				temp = temp + input.charAt(i);
			}

		}
		array[arrayIndex] = temp;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
