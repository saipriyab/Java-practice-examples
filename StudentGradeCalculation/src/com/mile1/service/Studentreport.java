package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class Studentreport {
	public String findGrade(Student studentobject)
	{
		String g="";
		int flag=1,sum=0;
		int a[]=studentobject.getMarks();
		for(int i=0;i<studentobject.getMarks().length;i++)
		{
			if(a[i]<35)
			{
				flag=0;
				break;
			}
			else
			{
				sum=sum+a[i];
			}
		}
		if(flag==0)
			g="F";
		else
		{
			if(sum<=150)
				g="D";
			else if(sum>150&&sum<=200)
				g="C";
			else if(sum>200&&sum<=250)
				g="B";
			else if(sum>250&&sum<=300)
				g="A";
			
		}
		return g;
	}
	public String validate(Student studentobject)throws  NullMarksArrayException,NullNameException,NullStudentException
	{
		String p="";
		int flag=0;
		try
		{
		if(studentobject==null)
		{
			flag=1;
		throw new NullStudentException();
		}
		else
		{
			if(studentobject.getName()==null)
			{
				flag=1;
				throw new NullNameException();
			
			}
			else
			{
				int h[]=studentobject.getMarks();
			
			    if(h==null)
			    {
			    	flag=1;
			    	throw new NullMarksArrayException();
			    }
			
			}
		}
		}
		catch(Exception e)
		{
			p=e.toString();
		}
		if(flag==0)
		{
			p= findGrade(studentobject);
		}
		return p;
	}
}
