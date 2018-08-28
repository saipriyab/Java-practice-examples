package com.mapexamples;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Example3 {
public static void main(String args[])
{
	Properties p=new Properties();
	p.put("ap","hyd");
	p.put("telangana","hyd");
	p.put("karnataka", "bangalore");
	Set k=p.keySet();
	Iterator i2=k.iterator();
	while(i2.hasNext())
	{
	  String l=(String)i2.next();
		System.out.println(p.getProperty(l));
	}
}
}
