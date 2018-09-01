package MySQLDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

import org.testng.annotations.Test;



public class DatabaseConnection 
{	
	@Test
	public void testdb() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		System.out.println("Driver Loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/selfdatabase","root","kesb");
		
		System.out.println("Connected to Mysql DB");
		
		Statement smt= con.createStatement();
		
		ResultSet rs=smt.executeQuery("SELECT * FROM friend");
		
		//System.out.println(rs);
		while(rs.next())
		{
			
			String fname=rs.getString("fname");
			
			String lname=rs.getString(3);
			String email=rs.getString("email");
			String sal=rs.getString("sal");
			String dob =rs.getString("dob");
			String loc=rs.getString("loc");
			System.out.println(fname+" "+lname+" "+email+" "+sal+" "+dob+" "+loc);	
			
		}
	}

}
