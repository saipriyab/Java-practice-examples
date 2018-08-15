package com.automobile.TwoWheeler;

public class Hero extends com.automobile.Vehicle{

	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "hero";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "xyz";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "abc";
	}
	public int getSpeed()
	{
		return 50;
	}
	public void radio()
	{
		System.out.println("radio");
	}

}
