package MySQLDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.*;
import com.thoughtworks.selenium.webdriven.commands.GetConfirmation;

import practice.tr;

public class DDLCommand {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		GetConnnecion();
		createTab();
		insertTab();
		truncate();
		alteradd();
		alterModify();
		alterDropCol();
		updateData();
		deleteData();	

	}
	
	public static Connection GetConnnecion()
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javasql","root","kesb");

			System.out.println("Connected");
			
			return con;
		}
		catch (Exception e) 
		{
			System.out.println(e);
			
		}
		return null;
	}

	public static void createTab()
	{
		try
		{
		Connection con=GetConnnecion();
		PreparedStatement create=con.prepareStatement("CREATE TABLE IF NOT EXISTS javatable(id int PRIMARY KEY,"
				+ "fname varchar(20),LNAME VARCHAR(20))");
		create.executeUpdate(); //execute DML command
		System.out.println("Table Created");
		}
		catch (Exception e) 
		{
			System.out.println(e);
			
		}
	}
	
	public static void alteradd() //throws SQLException
	{
		Connection con=GetConnnecion();
		PreparedStatement alteradd;
		try 
		{
			alteradd = con.prepareStatement("ALTER TABLE javatable ADD(ADD VARCHAR(20),xx VARCHAR(40))");
			alteradd.executeUpdate();
			System.out.println("Alter Add Complet");	
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void alterModify() //throws SQLException
	{
		Connection con=GetConnnecion();
		PreparedStatement alterModify;
		try
		{
			alterModify = con.prepareStatement("alter table javatable modify ADD varchar(40)");
			alterModify.executeUpdate();
			System.out.println("Alter Modify Complet");
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void alterDropCol()// throws SQLException
	{
		Connection con=GetConnnecion();
		PreparedStatement dropCol;
		try
		{
			dropCol = con.prepareStatement("ALTER TABLE javatable drop xx");
			dropCol.executeUpdate();
			System.out.println("Col is droped");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void renameTable() //throws SQLException
	{
		Connection con=GetConnnecion();
		PreparedStatement renameTable;
		try 
		{
			renameTable = con.prepareStatement("RENAME javatable to java");
			renameTable.executeUpdate();
			System.out.println("Rename table complet");	
		
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void insertTab()
	{
		try
		{
			Connection con=GetConnnecion();
			PreparedStatement insert=con.prepareStatement("insert into javatable (id,fname,lname) values(1,'mark','las'),"
					+ "(2,'qer','tyu')");
			insert.executeUpdate();
			System.out.println("Inserted");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	
	public static void updateData()// throws SQLException
	{
		Connection con=GetConnnecion();
		PreparedStatement updateData;
		try {
			updateData = con.prepareStatement("update javatable set lame='Abhi' where id=2");
			updateData.executeUpdate();
			System.out.println("Updated");
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void deleteData() //throws SQLException
	{
		Connection con=GetConnnecion();
		PreparedStatement delete;
		try 
		{
			delete = con.prepareStatement("Delete from javatable where id=2");
			delete.executeUpdate();
			System.out.println("Deleted");
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void truncate() //throws SQLException
	{
		Connection con=GetConnnecion();
		PreparedStatement tranket;
		try
		{
			tranket = con.prepareStatement("truncate table javatable");
			tranket.executeUpdate();
			System.out.println("truncate");
		
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}