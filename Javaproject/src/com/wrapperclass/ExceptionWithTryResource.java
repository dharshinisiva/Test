package com.wrapperclass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionWithTryResource {
	public static String textReader(String fileName, String findword) {
		int count = 0;
		String res = null;

		try (FileReader fr = new FileReader(fileName); BufferedReader br = new BufferedReader(fr)) {
			String eachline;
			while ((eachline = br.readLine()) != null) {
				String array[] = eachline.split(" ");
				for (int i = 0; i < array.length; i++) {
					if (array[i].equals(findword)) {
						count++;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}

		String result = Integer.toString(count);
		return result;
	}

	public static void main(String[] agrs) throws Throwable {
		String g = textReader("C:\\Users\\kk\\Desktop\\Developer.txt", "i");
		System.out.println(g);
	}
}
