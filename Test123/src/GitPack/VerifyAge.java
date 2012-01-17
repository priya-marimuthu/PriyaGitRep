package GitPack;
import java.io.IOException;
import java.util.*;
import java.text.*;
public class VerifyAge {
	public static void main(String[] args) throws IOException{
		System.out.println("Enter your Date of Birth in format MM-dd-yyyy");
		  Scanner input=new Scanner(System.in);
		  String dateOfBirth=input.nextLine() ;
		  Calendar currentDate = Calendar.getInstance();
		  SimpleDateFormat formatter= new SimpleDateFormat("MM-dd-yyyy");
		  String dateNow = formatter.format(currentDate.getTime());
		try {
		     Calendar cal1 = new GregorianCalendar();
		     Calendar cal2 = new GregorianCalendar();
		     Date date1 = new SimpleDateFormat("MM-dd-yyyy").parse(dateOfBirth);
		     Date date2 = new SimpleDateFormat("MM-dd-yyyy").parse(dateNow);
		     // System.out.println(date1);
		     //System.out.println(date2);
		     cal1.setTime(date1);
		     cal2.setTime(date2);
		     int DiffOfYears=(cal2.get(Calendar.YEAR)-cal1.get(Calendar.YEAR))-1;
		     int MonthsPassed=cal2.get(Calendar.MONTH)+(12-cal1.get(Calendar.MONTH));
		     if(DiffOfYears<1 && MonthsPassed<12){
		    	  int Months=MonthsPassed-1;
		    	  int days=cal2.get(Calendar.DATE)-cal1.get(Calendar.DATE);
		    	  System.out.println("\n"+Months+"Months\t"+days+"Days");
			  }
		      if(DiffOfYears<1 && MonthsPassed<1){
		    	  int days=cal2.get(Calendar.DATE)-cal1.get(Calendar.DATE);
		    	  int weeks=days/7;
		    	  int Days=days%7;
		    	  if(Days==1){
		    		  System.out.println("\n"+weeks+"Weeks\n"+Days+"Day");
		    	  }
		    	  System.out.println("\n"+weeks+"Weeks\n"+Days+"Days");
		      }
		      if(DiffOfYears>1 && DiffOfYears<20){
		      System.out.println("\n"+DiffOfYears+"Years\t"+MonthsPassed+"Months");
		      }
		      if(DiffOfYears>20){
			     System.out.println("\n"+DiffOfYears+"Years");
			  }
		      if(DiffOfYears<1 && MonthsPassed==12){
		    	  DiffOfYears=DiffOfYears+1;
		    	  MonthsPassed=MonthsPassed-12;
		    	  System.out.println("\n"+DiffOfYears+"Years\t"+MonthsPassed+"Months");
		      }
		  } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}