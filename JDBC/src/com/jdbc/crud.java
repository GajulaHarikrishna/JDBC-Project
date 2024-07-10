package com.jdbc;
import java.sql.*;
public class crud 
{

	public static void main(String[] args) 
	{
	   Connection cn=null;
	   Statement stm=null;
//	   ResultSet rs=null;
//	   PreparedStatement ps=null;
    try {
    	//load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//establish connection
	
			cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/joins","root","admin");
			//prepared statement
			stm=cn.createStatement();
			//execute statement 
			stm.executeUpdate("crete table emp( empid int primary key,empname varchar(50),doj int)");
			
		
		}
	 catch (ClassNotFoundException | SQLException e) 
    {
		
		e.printStackTrace();
	}
    
    	try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	try {
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	

}
