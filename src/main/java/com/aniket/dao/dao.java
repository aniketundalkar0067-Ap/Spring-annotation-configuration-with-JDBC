package com.aniket.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.aniket.dbconnection.Createdbconnection;
import com.aniket.student.Student;

@Repository
public class dao {

Connection con=	Createdbconnection.getconnection();
PreparedStatement pstm=null;
int x=0;

public String insertdata(Student stu)
{
	
	String query="insert into emp1 values(?,?,?,?)";
	
	try {
		pstm=con.prepareStatement(query);
		
		pstm.setInt(1,stu.getId());
		pstm.setString(2, stu.getName());
		pstm.setString(3, stu.getEmail());
        pstm.setString(4, stu.getMobile());
        
      pstm.executeUpdate();
      
      return"data successfully inserted";
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
	try
	{
		pstm.close();
		con.close();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
	return "";
	
}





public String getdata(int id)
{	
	String query="select*from emp1 where id=?";
	
	try {
		pstm=con.prepareStatement(query);
		pstm.setInt(1, id);
		
	ResultSet scs=pstm.executeQuery();
	
	if(scs.next())
	{
		
		System.out.println(scs.getInt(1));
		System.out.println(scs.getString(2));
		System.out.println(scs.getString(3));
	    System.out.println(scs.getString(4));	
		
	    return "ID Found Sucessfully";
	}
	else
	{
		return "ID Is Not Found";
	}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	return null;
	
}


public ArrayList<Object> getall()
{
	ArrayList<Object> sc=null;
String query="select*from emp1";
	
	try {
		pstm=con.prepareStatement(query);
		sc= new ArrayList<>(); 
	ResultSet scs=pstm.executeQuery();
	
	while(scs.next())
	{
		 
	sc.add(scs.getInt(1));
	sc.add(scs.getString(2));
	sc.add(scs.getString(3));
	sc.add(scs.getString(4));
		
		
	
	
	}
		
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	return sc;
}


public int  delete(int id)

{
String query="delete from emp1 where id=?";


try
{
pstm=con.prepareStatement(query);
pstm.setInt(1, id);
 x=pstm.executeUpdate();

System.out.println(x);



}
catch (Exception e) {
e.printStackTrace();
}
	
return x;
	
	
}


public int update(String name ,int id)
{
	int x=0;
	String query="update emp1 set name=? where id=?";

try
{
	pstm=con.prepareStatement(query);
   pstm.setString(1, name);
   pstm.setInt(2, id);
   
  x= pstm.executeUpdate();

}
catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}

return x;





}






















}