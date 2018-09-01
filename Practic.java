package DatabaseFrame;

public class Practic {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/javasql";
		String user="root";
		String password="kesb";
		Sql.getConnection(url, user, password);
		Sql.createTable("Create table Abhi (id int(10) Primary key,fname varchar(40))");
	}

}
