package com.mapexamples;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Country2 c=new Country2();
c.saveCountryCapital("India", "Delhi");
c.saveCountryCapital("Japan", "Tokyo");
System.out.println(c.getCapital("India"));
System.out.println(c.getCountry("Tokyo"));
c.print();
c.store();
	}

}
