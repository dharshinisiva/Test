package com.Collection;

import java.util.List;
import java.util.ArrayList;

public class StudentList {

	int id;
	String name;

	StudentList(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentList> Studentdata = new ArrayList<StudentList>();
		StudentList s1 = new StudentList(1, " Ramani ");
		StudentList s2 = new StudentList(2, " Ramya ");
		StudentList s3 = new StudentList(3, " Ragavi ");
		StudentList s4 = new StudentList(4, " Pavya ");
		StudentList s5 = new StudentList(5, " Priya ");

		Studentdata.add(s1);
		Studentdata.add(s2);
		Studentdata.add(s3);
		Studentdata.add(s4);
		Studentdata.add(s5);
		System.out.println(s4.id + s4.name);

	}

}
