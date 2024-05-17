package busreservation;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.ParseException;
import java.sql.SQLException;
public class booking {
   
	String passengername;
    int busno;
    Date date;
    
    public booking()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter name of passenger: ");
    	passengername= sc.next();
    	System.out.println("enter bus no: ");
    	busno=sc.nextInt();
    	System.out.println("enter date dd-mm-yyyy: ");
    	String dateInput=sc.next();

    	SimpleDateFormat dateFormat =new SimpleDateFormat("dd-MM-yyyy");
    	try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    }
    
    public boolean isavailable()throws SQLException
    {
    	busDAO busdao=new busDAO();
    	bookingdao bookingda=new bookingdao();
    	int capacity=busdao.getcapacity(busno);
    	int booked=bookingda.getbookedcount(busno,date);
    	 
    	return booked<capacity;
//    
    }
}

 

