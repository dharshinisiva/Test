package com.stringmethods;

public class chochlate {
	public static int getChochlateCount(int rupees) {
		int noOfChoch=rupees/3;
		int noOfWrappers=noOfChoch;
		while(noOfWrappers>=3) {
			int extrachoch=noOfWrappers/3;
			noOfChoch=extrachoch+noOfChoch;
			int extraWrapper=noOfWrappers%3;
			noOfWrappers=extrachoch+extraWrapper;
			}
		return noOfChoch;
	}
	public static void main(String[] agrs) {
		System.out.println(getChochlateCount(100));
	}

}
