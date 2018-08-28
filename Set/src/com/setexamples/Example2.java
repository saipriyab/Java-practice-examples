package com.setexamples;

import java.util.HashSet;
import java.util.Iterator;

public class Example2 {
public static void main(String args[])
{
	HashSet s1=new HashSet();
	s1.add("abc");
	s1.add("def");
	s1.add("ghi");
	s1.add("jkl");
	Iterator i2=s1.iterator();
	while(i2.hasNext())
	{
		System.out.println(i2.next());
	}
}
}
