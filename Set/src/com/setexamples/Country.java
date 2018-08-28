package com.setexamples;

import java.util.HashSet;
import java.util.Iterator;

public class Country {
HashSet country=new HashSet();
public HashSet saveCountryNames(String CountryName) 
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
