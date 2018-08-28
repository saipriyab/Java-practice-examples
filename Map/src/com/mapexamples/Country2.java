/**
 * @author saipriyadarshini
 *
 */
package com.mapexamples;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;


public class Country2 {
Hashtable CountryMap=new Hashtable();
ArrayList a2=new ArrayList();
public Hashtable saveCountryCapital(String CountryName, String capital) 
{
	CountryMap.put(CountryName,capital);
	return CountryMap;
}
public String getCapital(String CountryName)
{
	String p="";
	Set<Entry<String,String>> p4=CountryMap.entrySet();
	for(Entry<String,String> p5:p4)
	{
		String p6=p5.getKey();
		if(p6.equalsIgnoreCase(CountryName))
		{
			p=p5.getValue();
		}
	}
	return p;
}
public String getCountry(String capitalName) 
{
	String p1="";
	Set<Entry<String,String>> p4=CountryMap.entrySet();
	for(Entry<String,String> p5:p4)
	{
		String p6=p5.getKey();
		String p7=p5.getValue();
		if(p7.equalsIgnoreCase(capitalName))
		{
			p1=p6;
		}
	}
	return p1;
	
}
public void print()
{
	System.out.println("Key- Capital"+"\t"+"Value-Country");
	Set<Entry<String,String>> p4=CountryMap.entrySet();
	for(Entry<String,String> p5:p4)
	{
		String p6=p5.getKey();
		String p7=p5.getValue();
		System.out.println(p6+"\t"+p7);
		
	}
}
public ArrayList store()
{
	Set<Entry<String,String>> p4=CountryMap.entrySet();
	for(Entry<String,String> p5:p4)
	{
		String p6=p5.getKey();
		a2.add(p6);
		
	}
	return a2;
}
}
