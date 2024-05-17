package busreservation;

import java.sql.*;


public class dbconnect {
	
	private static final String url="jdbc:mysql://localhost:3306/busresv";
	private  static final String username="root";
	private  static final String password ="dbms";
	
	public static Connection getConnection()throws SQLException{
	 return DriverManager.getConnection(url,username,password);
	}
	
	
	
}
