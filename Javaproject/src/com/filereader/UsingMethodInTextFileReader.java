package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingMethodInTextFileReader {
	public static String textReader(String fileName, String findword)throws IOException {
		FileReader fr=new FileReader(fileName);
		BufferedReader br=new BufferedReader(fr);
		String eachline;
		int count=0;
		while ((eachline = br.readLine()) != null) {
			String array[] = eachline.split(" ");
			for (int i = 0; i < array.length; i++) {
				if (array[i].equals(findword)) {
					count++;
				}
			}
		}
    fr.close();
    br.close();
    String res=Integer.toString(count);
    return res;
	}

public static void main(String[] agrs) throws Throwable {
	String g=textReader("C:\\Users\\kk\\Desktop\\Developer.txt","i");
	System.out.println(g);
}
}