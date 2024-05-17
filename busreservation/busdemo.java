package busreservation;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;

public class busdemo {
   public static void main(String []args) throws SQLException
   {  

	   busDAO busdao=new busDAO();
	   
	   try {
	   busdao.displaybusinfo();
	   
	   int useropt=1;
       Scanner sc=new Scanner(System.in); 
	   while(useropt==1)
	   {
		   System.out.println("enter 1 to book and 2 to exit");
		   useropt=sc.nextInt();
		   if(useropt==1)
		   {
	         	booking bookin = new booking(); 
                 if(bookin.isavailable())
	         	{
	         		bookingdao bookingda=new bookingdao();
	         		bookingda.addbooking(bookin);
	         		System.out.println("ur booking i confirmed");
	         	}
	         	else
	         		 System.out.println("no overbooking  ,try another bus or another date");
	         	
	         	
		   }
	   }
	   }catch(Exception e)
	   {
		   System.out.println("error occered is : "+e);
	   }
	   
   }
}
