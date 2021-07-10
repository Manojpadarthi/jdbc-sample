package com.jdbc.sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Sample {
	
	public static void main(String[] args) throws SQLException
	{  
		Connection con=null;
		
		try 
		{
			
			
			Class.forName("com.mysql.jdbc.Driver");
		  con= DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "manoj", "manoj143");
		 
		  con.setAutoCommit(false);
		  PreparedStatement st = con.prepareStatement("select * from testdb.user where id=?");
		 
		  st.setInt(1, 10);
		  ResultSet rs=st.executeQuery();
		  
				 while(rs.next()){
					 System.out.println(rs.getString(2));
				 }
		  
		  Helper helper = new Helper();
		  
		  
		  if(helper.isOk().equals("yes"))
		  
				  
		  {
			  con.commit();
			  System.out.println("committed");
		  }
		  else{
			  con.rollback();
			  System.out.println("roll backed");
		  }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			con.close();
		}
		
		
		
	}

}
