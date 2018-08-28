package com.mapexamples;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap m1=new HashMap();
         m1.put("a", "xyz");
         m1.put("b","xyz");
         System.out.println(m1.containsKey("a"));
         System.out.println(m1.containsValue("xyz"));
         Set<Entry<String,String>> p=m1.entrySet();
         for(Entry<String,String> p2:p)
         {
        	 System.out.println(p2.getKey()+" "+p2.getValue());
         }
	}

}
