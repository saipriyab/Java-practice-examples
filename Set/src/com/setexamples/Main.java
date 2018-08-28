package com.setexamples;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Country c=new Country();
    c.saveCountryNames("India");
    c.saveCountryNames("Japan");
    System.out.println(c.getCountry("India"));
	}

}
