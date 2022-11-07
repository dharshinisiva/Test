package bean;

import java.util.HashSet;

public class StudentHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Students> hs = new HashSet<Students>();
		Students s1 = new Students("Meena", 5);
		Students s2 = new Students("Dhivya", 6);
		Students s3 = new Students("Kaviya", 7);
		Students s4 = new Students("Oviya", 8);
		Students s5 = new Students("Priya", 9);

		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		hs.add(s5);
		for (Students s : hs) {
			if (s.getName().startsWith("D")) {
				System.out.println(s.getName());
			}

		}

	}

}
