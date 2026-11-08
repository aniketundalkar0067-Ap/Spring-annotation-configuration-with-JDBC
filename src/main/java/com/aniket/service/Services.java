package com.aniket.service;

import com.aniket.dao.dao;
import com.aniket.student.Student;

import java.util.ArrayList;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class Services {
	@Autowired
	 dao d1;
	public String insertdata(Student stu)
	{
		return d1.insertdata(stu);
	}
	
	
	public String  getdata(int id) {
		return d1.getdata(id);
	}
	
	
	
	public String  getall()
	{
		ArrayList<Object> getdata = d1.getall();
		
		if(getdata!=null)
		{
			ListIterator<Object> listIterator = getdata.listIterator();
			
			while(listIterator.hasNext())
			{
			 System.out.println(listIterator.next());
			}
			return    "ID Found ";
		}
		else
		{
			return "ID Is Not Found ";
		}
		
	}
	
	

	public String  delete(int id)

	{
		int x=d1.delete(id);
		
		
		if(x==1)
		{
			return "Data Deleted";
		}
		else
		{
			return " ID Is Not Found";
		}
	}

	
	
	public String update(String name ,int id)
	{
	int x=	d1.update(name, id);
	
	if(x>0)
	{
		  return "Data Update";
	}
	else
	{
		  return "ID Is Not Found";
	}
	}
}
