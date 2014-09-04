import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;


public class FileHandling {
FileHandler file = new FileHandler();
public FileHandling() throws Exception {
	
}
public static void main(String args[]) throws IOException
{
	BufferedReader br = null;
	try{
		br =new BufferedReader( new FileReader("src/Sample1.txt"));
		br.readLine();
		String sCurrentLine;
		int Total;
		System.out.println(br.readLine());
		
		while ((sCurrentLine = br.readLine()).concat("adding") != null) {
			System.out.println(sCurrentLine);
		}
		Total = br.read();
System.out.println(Total);

		
	}catch (IOException e)
	{
		br.close();
		System.out.println("file not read");
		e.printStackTrace();
	}
}
}
