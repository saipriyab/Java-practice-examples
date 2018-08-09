package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentService;
import com.mile1.service.Studentreport;

public class Studentmain {
static Student data[]=new Student[4];
static
{
	for(int i=0;i<data.length;i++)
		data[i]=new Student();
	data[0]=new Student("Sekar",new int[] {35,35,35});
	data[1]=new Student(null,new int[] {11,22,33});
	data[2]=null;
	data[3]=new Student("Manoj",null);
}
public static void main(String args[])
{
	StudentService studentService=new StudentService();
	Studentreport studentreport=new Studentreport();
	System.out.println("Grades Calculation");
	String x=null;
	for(int i=0;i<data.length;i++)
	{
		try
		{
			x=studentreport.validate(data[i]);
		}
		
			catch(NullNameException e)
			{
				x="NullName exception occurred";
			}
		catch(NullMarksArrayException e)
		{
			x="NullMarksArray exception occurred";
		}
		catch(NullStudentException e)
		{
			x="NullStudent exception occurred";
		}
				System.out.println("GRADE="+x);
	}
	System.out.println("Number of objects with marks array as null "+studentService.findNumberOfNullMarks(data));
	System.out.println("Number of objects with name as null "+studentService.findNumberOfNullNames(data));
	System.out.println("Number of objects that are entirely  null "+studentService.findNumberOfNullObjects(data));
	
}
}
