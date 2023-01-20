package textfileFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteMultipleLineData
{
	public static void main(String[] args) throws Exception 
	{
		File f=new File("../textfileFileHandling/govind2.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I am Govind");       //Change Line Use bw.newLine();
		bw.newLine();
		bw.write("I am from UP");
		bw.close();
	}

}
