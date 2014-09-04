import java.text.SimpleDateFormat;
import java.util.Date;


final class DateExample {
	static SimpleDateFormat dateformat = new SimpleDateFormat("MMddyy");
	static Date date = new Date();
	int x = 10;
	protected DateExample(){
	
	}
	public static void main(String args[]){
	//Fibonacci series- 1,1,2,3,5,8...
	//	int j=1;
		int x=10;
		int feb[]= new int[x];
		feb[0]=0;
		feb[1]=1;
		for(int i=2;i<x;i++)
		{
						
			
			feb[i]=feb[i-1]+feb[i-2];
		//	System.out.println(feb[i]);
			
		}
		for(int i=0;i<x;i++)
		{
			System.out.println(feb[i]);
		}
		
	}
	

protected  void date(){
	System.out.println(dateformat.format(date));
}

public void fibonnaciseries(int x)
{
	//int x=10;
	int feb[]= new int[x];
	feb[0]=0;
	feb[1]=1;
	for(int i=2;i<x;i++)
	{
					
		
		feb[i]=feb[i-1]+feb[i-2];
	//	System.out.println(feb[i]);
		
	}
	for(int i=0;i<x;i++)
	{
		System.out.println(feb[i]);
	}
	
}

}
