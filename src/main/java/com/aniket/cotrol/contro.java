package com.aniket.cotrol;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.aniket.service.Services;
import com.aniket.student.Student;

@Controller
public class contro {

	@Autowired
	Services sc;
public String insertdata(Student stu)
	{
		return sc.insertdata(stu);
	}
	
	public String  getdata(int id)
	{
		return sc.getdata(id);
	}
	
	
	public String  getall()
	{
	 return sc.getall();
	 }
	
	
	public String  delete(int id)
	{
		return sc.delete(id);
	}
	
	
	public String update(String name ,int id)
	{
		return sc.update(name, id);
	}
}
