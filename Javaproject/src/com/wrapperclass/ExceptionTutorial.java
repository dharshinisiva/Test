package com.wrapperclass;

public class ExceptionTutorial {
	public void printNumber() {
		try {
		System.out.println("Hi");
		int i = 10/0;
		System.out.println("Hello");
	} catch(Exception e) {
		e.printStackTrace();
	}
finally{
	System.out.println("hiiii");}
		
}
	public static void main(String []args) {
		ExceptionTutorial p = new ExceptionTutorial();
		p.printNumber();
		System.out.println("Hey");
		
	}

}
