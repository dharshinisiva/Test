package beantwo;

import java.util.ArrayList;
import java.util.List;

public class StudentImplementation {

	private static final int sum = 0;

	public static void main(String[] args) {
		StudentImplementation implementation = new StudentImplementation();
		List<Student> StudentList = implementation.preperStudentData();
		implementation.printdata(StudentList);
	}

	private Student studentData;

	public void printdata(List<Student> StudentList) {
		for (Student Studentdata : StudentList) {
			System.out.println(Studentdata);

		}

	}

	public List<Student> resultCalculation(List<Student> studList) {
		List<Student> students = new ArrayList<Student>();
		{
			for (Student studentData : studList) {
				int sum = 0;
				// boolean isPassed = true;
				for (Student subject : students) {
					sum = sum + subject.getTotal();

				}
			}
			studentData.setTotal(sum);
			students.add(studentData);

		}
		return students;
	}

	private List<Student> preperStudentData() {

		StudentImplementation s = new StudentImplementation();
		ArrayList<Subject> sub1 = new ArrayList<>();
		Subject m1 = new Subject("Medal algebra", 789, 70, 001);
		Subject m2 = new Subject("Real analysis", 790, 75, 001);
		Subject m3 = new Subject("Calculus", 800, 80, 001);
		Subject m4 = new Subject("Differential calculus", 801, 85, 001);
		Subject m5 = new Subject("Functions group", 802, 90, 001);

		sub1.add(m1);
		sub1.add(m2);
		sub1.add(m3);
		sub1.add(m4);
		sub1.add(m5);

		ArrayList<Subject> sub2 = new ArrayList<>();
		Subject p1 = new Subject("Physical chemistry", 321, 65, 002);
		Subject p2 = new Subject("Physics lab", 322, 70, 002);
		Subject p3 = new Subject("Thermodynamics", 323, 75, 002);
		Subject p4 = new Subject("Classical mechanics", 324, 80, 002);
		Subject p5 = new Subject("Fundamentals dynamics", 325, 85, 002);

		sub2.add(p1);
		sub2.add(p2);
		sub2.add(p3);
		sub2.add(p4);
		sub2.add(p5);

		ArrayList<Subject> sub3 = new ArrayList<>();
		Subject c1 = new Subject("Organic chemistry", 326, 69, 003);
		Subject c2 = new Subject("Inorganic chemistry", 327, 74, 003);
		Subject c3 = new Subject("Chemical bounding", 328, 78, 003);
		Subject c4 = new Subject("Atomic structure", 329, 82, 003);
		Subject c5 = new Subject("Chemical kinetics", 340, 85, 003);

		sub3.add(c1);
		sub3.add(c2);
		sub3.add(c3);
		sub3.add(c4);
		sub3.add(c5);

		ArrayList<Subject> sub4 = new ArrayList<>();
		Subject b1 = new Subject("Biochemist", 341, 86, 004);
		Subject b2 = new Subject("Microbiologists", 342, 87, 004);
		Subject b3 = new Subject("Environmental scientist", 343, 90, 004);
		Subject b4 = new Subject("Biology technician ", 344, 92, 004);
		Subject b5 = new Subject("Hoticulturist", 345, 94, 004);

		sub4.add(b1);
		sub4.add(b2);
		sub4.add(b3);
		sub4.add(b4);
		sub4.add(b5);

		ArrayList<Subject> sub5 = new ArrayList<>();
		Subject cs1 = new Subject("Digital electronics", 346, 70, 005);
		Subject cs2 = new Subject("Discrete mathematics", 347, 80, 005);
		Subject cs3 = new Subject("Computer organization", 348, 83, 005);
		Subject cs4 = new Subject("Numerical analysis", 349, 85, 005);
		Subject cs5 = new Subject("System softwara", 350, 90, 005);

		sub5.add(cs1);
		sub5.add(cs2);
		sub5.add(cs3);
		sub5.add(cs4);
		sub5.add(cs5);

		ArrayList<Student> StudentList = new ArrayList<>();
		Student s1 = new Student(01, "dharshini", "maths", sub1);
		Student s2 = new Student(02, "madhu", "physice", sub2);
		Student s3 = new Student(03, "rose", "chimistry", sub3);
		Student s4 = new Student(04, "priya", "biology", sub4);
		Student s5 = new Student(05, "niha", "computery", sub5);
		StudentList.add(s1);
		StudentList.add(s2);
		StudentList.add(s3);
		StudentList.add(s4);
		StudentList.add(s5);
		return StudentList;

	}

}
