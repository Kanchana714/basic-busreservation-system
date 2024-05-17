package busreservation;

public class bus {
   private int busno;
   private boolean ac;
   private int capacity;
   
   
   bus(int no,boolean ac,int cap)
   {
	   this.busno=no;
	   this.ac=ac;
	   this.capacity=cap;   
   }
   public int getbusno()
   {
	   return busno;
   }
   public int  getcapacity()
   {
	   return capacity;
   }
   public void setcapacity(int cap)
   {
	   capacity=cap;
   }
   public void setac(boolean val)
   {
	   ac=val;
   }
   
   public boolean isac()
   {
	   return ac;
   }
   
   public void displaybusinfo()
   {
	   System.out.println("bussno : "+busno+" ac: "+ac+" totalcapacity : "+capacity);
	   
   }
   
}
