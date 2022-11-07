package com.Collection;

import java.util.LinkedHashSet;

public class CollectionLinkedHashSetUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String>lhs = new LinkedHashSet<String>();
		lhs.add("cat");
		lhs.add("cow");
		lhs.add("dog");
		lhs.add("goat");
		lhs.remove("goat");
		for (String b : lhs) {
			System.out.println(b); 
			
			
		}
		
			
		}

	}


