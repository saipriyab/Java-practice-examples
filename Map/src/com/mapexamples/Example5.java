package com.mapexamples;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashMap<String,Integer> ContactList=new HashMap<String,Integer>();
   ContactList.put("sai", 1234567890);
   ContactList.put("priya",1023456789);
   System.out.println(ContactList.containsKey("sai"));
   System.out.println(ContactList.containsValue(1234567890));
   Set<Entry<String, Integer>> p6=ContactList.entrySet();
	for(Entry<String, Integer> p7:p6)
	{
		System.out.println(p7.getKey()+" "+p7.getValue());
	}
   		
	}

}
