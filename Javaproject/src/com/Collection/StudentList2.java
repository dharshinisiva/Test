package com.Collection;

import java.util.List;
import java.util.ArrayList;

public class StudentList2 {

	int id;
	String name;

	StudentList2(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentList2> Studentdata = new ArrayList<StudentList2>();
		StudentList2 s1 = new StudentList2(1, " Ramani ");
		StudentList2 s2 = new StudentList2(2, " Ramya ");
		StudentList2 s3 = new StudentList2(3, " Ragavi ");
		StudentList2 s4 = new StudentList2(4, " Pavya ");
		StudentList2 s5 = new StudentList2(5, " Priya ");

		Studentdata.add(s1);
		Studentdata.add(s2);
		Studentdata.add(s3);
		Studentdata.add(s4);
		Studentdata.add(s5);
		System.out.println(s4.id + s4.name);

	}

}
