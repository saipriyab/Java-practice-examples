package com.setexamples;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Example3 {
public static void main(String args[])
{
	TreeSet s1=new TreeSet(	Collections.reverseOrder());
	s1.add("a");
	s1.add("r");
	s1.add("g");
	s1.add("d");

	Iterator i3=s1.iterator();
	while(i3.hasNext())
	{
		System.out.println(i3.next());
	}
	System.out.println(s1.contains("d"));
}
}
