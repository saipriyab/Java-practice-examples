package com.automobile.TwoWheeler;

public class Honda extends com.automobile.Vehicle{
	@Override
	public String getModelName() {
		// TODO Auto-generated method stub
		return "honda";
	}

	@Override
	public String getRegistrationNumber() {
		// TODO Auto-generated method stub
		return "xyz1";
	}

	@Override
	public String getOwnerName() {
		// TODO Auto-generated method stub
		return "abc1";
	}
	public int getSpeed()
	{
		return 50;
	}
	public void cdplayer()
	{
		System.out.println("cd palyer");
	}
}
