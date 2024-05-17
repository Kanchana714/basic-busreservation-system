package busreservation;
import  java.util.Date;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class bookingdao {

	public int getbookedcount(int busno,Date date)throws SQLException
	{
		String query="select count(bus_no) from booking where bus_no=? and travel_date=?";
		
		Connection con=dbconnect.getConnection(); 
		PreparedStatement pst=con.prepareStatement(query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		
		pst.setInt(1,busno);
		pst.setDate(2,sqldate);
		ResultSet rs=pst.executeQuery();
		
		rs.next();
		return rs.getInt(1);
		//return rs.get
			
	}
	
	public void addbooking(booking bookin)throws SQLException
	{
		String query="insert into booking value(?,?,?)";
		Connection con=dbconnect.getConnection();
		java.sql.Date sqldate=new java.sql.Date(bookin.date.getTime());
		PreparedStatement pst= con.prepareStatement(query);
		pst.setString(1,bookin.passengername);
		
		pst.setInt(2, bookin.busno);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
		
		
	}
}
