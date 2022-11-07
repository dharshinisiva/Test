package com.Collection;

import java.util.ArrayList;

public class CollectionsOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(21);
		al.add(76);
		al.add(67);
		al.add(65);
		al.add(75);
		al.add(95);
		al.remove(3);
		for (Integer b : al) {
			System.out.println(b);

		}

	}

}
