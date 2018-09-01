package DatabaseFrame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.thoughtworks.selenium.webdriven.commands.GetConfirmation;

public class Sql
{
	public static Connection con;
	public static Connection getConnection(String url, String user, String password) throws Throwable
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection(url, user, password);
		con=conn;
		System.out.println("Connected");
		return conn;
		
	}
	public static void createTable(String query) throws SQLException
	{
		PreparedStatement createTable=con.prepareStatement(query);
		createTable.executeUpdate();
		System.out.println("Table Created");
	}
	public static void alterAddCol(String query) throws SQLException
	{
		PreparedStatement alterAddCol=con.prepareStatement(query);
		alterAddCol.executeUpdate();
		System.out.println("Colume Added");
	}
	public static void alterModifyCol(String query) throws SQLException
	{
		PreparedStatement alterModifyCol=con.prepareStatement(query);
		alterModifyCol.executeUpdate();
		System.out.println("Modified");
	}
	public static void alterDeleteCol(String query) throws SQLException
	{
		PreparedStatement alterDeleteCol=con.prepareStatement(query);
		alterDeleteCol.executeUpdate();
		System.out.println("Colume Deleted");
	}
	
	
}

