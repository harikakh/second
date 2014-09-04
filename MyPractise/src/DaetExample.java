import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DaetExample {
static	Date tomorw;
static Date today;
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
	/*	today=calendar.getTime();
		System.out.println("today" + today);*/
		
		
		calendar.add(Calendar.DATE, 2);
		tomorw = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String s =formatter.format(tomorw);
		System.out.println(tomorw);
		  System.out.println("Tomorrow : " + tomorw+ "formaated"+ s);
//DateSample();
	}
	public static void DateSample(){
		 String s;
		  Date date;
		  Format formatter;
		  Calendar calendar = Calendar.getInstance();

		  date = calendar.getTime();
		  formatter = new SimpleDateFormat("dd/MMM/yyyy");
		  s = formatter.format(date);
		  System.out.println("Today : " + s);

		  calendar.add(Calendar.DATE, 1);
		  date = calendar.getTime();
		  formatter = new SimpleDateFormat("dd/MMM/yyyy");
		  s = formatter.format(date);
		  System.out.println("Tomorrow : " + s);
		  }
		
	

}
