package com.classes;

public class Mobile {
	String name;
	String color;
	int ram;
	float size;
	int prize;
	String processes;

	public Mobile(String name, String color, int ram) {
		this.name = name;
		this.color = color;
	}

	public void makecall(int no) {
		System.out.println("calling " + " 987654321");
	}

	public static void main(String[] args) {
		Mobile m2 = new Mobile("vivo", "gray", 3);
		System.out.println(m2.name);
		System.out.println(m2.processes);
		m2.makecall(679044);
	}
}
