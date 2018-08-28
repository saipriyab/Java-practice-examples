package com.setexamples;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Country1 c=new Country1();
    c.saveCountryNames("India");
    c.saveCountryNames("Japan");
    System.out.println(c.getCountry("India"));
	}

}
