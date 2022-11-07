package bean;

import java.util.ArrayList;

public class StudentDetails {
	public static void main(String[] args) {

		ArrayList<Students> als = new ArrayList<Students>();
		Students s1 = new Students("Priya", 4);
		Students s2 = new Students("Pavi", 5);
		Students s3 = new Students("devi", 6);
		Students s4 = new Students("Dhanu", 7);
		Students s5 = new Students("Bhuvi", 8);

		als.add(s1);
		als.add(s2);
		als.add(s3);
		als.add(s4);
		als.add(s5);
		for (Students s : als) {
			if (s.getName().startsWith("P")) {
				System.out.println(s.getName());
			}

		}

	}
}