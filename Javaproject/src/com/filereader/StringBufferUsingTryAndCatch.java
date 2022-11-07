package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class StringBufferUsingTryAndCatch {
	public static void main(String[] args) throws Throwable {
		FileReader fr = new FileReader("C:\\Users\\kk\\Desktop\\Developer.txt");
		BufferedReader br = new BufferedReader(fr);
		String findword = "i";
		String eachline;
		int count = 0;
		while ((eachline = br.readLine()) != null) {
			String array[] = eachline.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (array[i].equals(findword)) {
					count++;
					try {
					i=count/0;
				}catch(Exception e) {
					e.printStackTrace();
				}
				}
			}
		}

		System.out.println(count);
		fr.close();
		br.close();
	}
}

