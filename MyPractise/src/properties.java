import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class properties {
public static void Test(String[] args) throws ParserConfigurationException, SAXException, IOException{
	String Elementname="src";
	Properties prop = new Properties();
	File excelfile = new File("NewFile.xml");
	String line="";
	BufferedReader br = new BufferedReader(new FileReader("NewFile.xml"));
	while( (line=br.readLine())!=null)
		System.out.println(line);
	
	br.close();
		
		excelfile.createNewFile();
DocumentBuilderFactory DBFactory=DocumentBuilderFactory.newInstance();
DocumentBuilder DBuilder = DBFactory.newDocumentBuilder();
Document doc =DBuilder.parse(excelfile);

NodeList nl =doc.getElementsByTagName(Elementname);
nl.getLength();
nl.item(1);
System.out.println(nl.item(1));
String content="hello";
File file =new File("Ship.txt");
FileWriter FW = new FileWriter(file.getAbsoluteFile());
BufferedWriter BW =new BufferedWriter(FW);
BW.write(content);
BW.flush();
BW.close();

FileOutputStream FS =new FileOutputStream(file);
byte[] text = content.getBytes();
FS.write(text);
FS.flush();
FS.close();
}
}
