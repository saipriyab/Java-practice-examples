package com.mapexamples;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Country1 c=new Country1();
c.saveCountryCapital("India", "Delhi");
c.saveCountryCapital("Japan", "Tokyo");
System.out.println(c.getCapital("India"));
System.out.println(c.getCountry("Tokyo"));
c.print();
c.store();
	}

}
