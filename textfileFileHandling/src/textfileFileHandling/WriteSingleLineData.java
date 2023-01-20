package textfileFileHandling;

import java.io.File;
import java.io.FileWriter;

public class WriteSingleLineData
{
	public static void main(String[] args) throws Exception 
	{
		File f=new File("../textfileFileHandling/govind1.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("I am Govind");
		fw.close();
	}
	

}
