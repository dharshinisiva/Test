package com.Collection;

import java.awt.event.FocusEvent;
import java.util.LinkedHashSet;

public class CollectionLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer>lh = new LinkedHashSet<Integer>() ;
			lh.add(70);
			lh.add(40);
			lh.add(50);
			for (Integer a : lh) {
				System.out.println(a);
				
			}
		
		

	}

}
