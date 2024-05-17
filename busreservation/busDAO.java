package busreservation;

import java.sql.*;

public class busDAO {

	public void displaybusinfo() throws SQLException
	{
		String query="select * from bus";
		Connection con =dbconnect.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
			System.out.println("bus no :  "+rs.getInt(1));
			if(rs.getInt(2)==0)
			{
			System.out.println("AC: no");
			}
			else
			{
				System.out.println("AC: yes");
			}
				System.out.println("Capacity : "+rs.getInt(3));
			
		}
		System.out.println("------------------------------------");
		
	}
	
	public  int getcapacity(int id)throws SQLException
	{
		
		String query ="select capacity from bus where id= "+id;
		Connection con=dbconnect.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		
	}
}
