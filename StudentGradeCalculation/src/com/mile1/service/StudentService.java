package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {
public int findNumberOfNullMarks(Student data[])
{
	int count=0;
	for(int i=0;i<data.length;i++)
	{
		if(data[i]!=null)
		{
		if(data[i].getMarks()==null)
		{
			count++;
		}
		else
		{
			
		}
		}
			
	}
	return count;
}
public int findNumberOfNullNames(Student data[])
{
	int count=0;
	for(int i=0;i<data.length;i++)
	{
		if(data[i]!=null)
		{
		String p=data[i].getName();
		if(p==null)
		{
			count++;
		}
		else
		{
			
		}
		}
			
	}
	return count;
}
public int findNumberOfNullObjects(Student data[])
{
	int count=0;
	for(int i=0;i<data.length;i++)
	{
		if(data[i]==null)
		{
			count++;
		}
		else
		{
			
		}
	}
	return count;
}
}
