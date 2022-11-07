package com.Collection;

import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

public class CollectionTreeSetUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>tss = new TreeSet<String>();
		tss.add("raman");
		tss.add("ramu");
		tss.add("ragul");
		tss.add("rangan");
		for (String b : tss) {
			System.out.println(b);
			
		}

	}

}
