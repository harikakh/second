import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


public class Arraylist {
public static void main(String args[]){
	ArrayList<Integer> array = new ArrayList<Integer>();
	List<Integer> array1 = new LinkedList<Integer>();
	array.add(0);
	array.add(3);
	array.indexOf(3);
	array.add(7);
//	System.out.println(array.indexOf(3));
	//System.out.println(array);
	for(Integer value : array){
		System.out.println(value);
	}
	array.set(1, 78);
	System.out.println(array);
	long start= System.currentTimeMillis();
	array1.add(4);
long end=	System.currentTimeMillis();
	System.out.println("diff" + (end-start));
//	List<Date> date = new ArrayList<Date>();
	Calendar date1 = Calendar.getInstance() ;
	Date tomorw = null;
	date1.setTime(tomorw);
	Date sample=date1.getTime();
	 date1.add(Calendar.DATE, 1)  ;	
	 tomorw=date1.getTime();
System.out.println("date"+tomorw);
	
	
}
}
