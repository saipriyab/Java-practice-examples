package com.mapexamples;

import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		p.put("ap","hyd");
		p.put("telangana","hyd");
		p.put("karnataka", "bangalore");
		Set<Entry<Object, Object>> p6=p.entrySet();
		for(Entry<Object,Object> p7:p6)
		{
			System.out.println(p7.getKey()+" "+p7.getValue());
		}
	}

}
