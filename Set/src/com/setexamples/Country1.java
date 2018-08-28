package com.setexamples;

import java.util.Iterator;
import java.util.TreeSet;

public class Country1 {
TreeSet country=new TreeSet();
public TreeSet saveCountryNames(String CountryName) 
{
	country.add(CountryName);
	return country;
}
public String getCountry(String CountryName)
{
	String g=null;
	Iterator i2=country.iterator();
	while(i2.hasNext())
	{
		String g2=(String)i2.next();
		if(g2.equals(CountryName))
			g="exists";
	}
	return g;
}

}
