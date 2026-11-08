package com.aniket.mains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aniket.cotrol.contro;
import com.aniket.student.Student;

@Component
public class call {
	@Autowired
	contro c1;
	
	public String  callingallMethod()
	{
		
             //		add data int emp1 table 

  //	Student sc=new Student(3, "Sachin", "Aniket007@gmail.com"," 9766069903");
 //		return c1.insertdata(sc);
		
               // get single data from emp1 table
 	//return c1.getdata(3);
	
		
    //get all data from emp1 table
		//c1.getall();
		// get all data from emp1 table
		
	 
		//return c1.delete(1);
		
		
		// update data in emp1 table 
		return c1.update("Aniket undalkar", 10);
		
	
	}
}
