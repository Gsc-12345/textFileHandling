package textfileFileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteExistingAndNewData 
{
	public static void main(String[] args) throws Exception 
	{
		File f=new File("../textfileFileHandling/govind2.txt");
		FileWriter fw=new FileWriter(f,true);                    //use boolen Append(f,true)
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("I have Completed my Graduation");
		bw.newLine();
		bw.write("I am Pursuing Msc");
		bw.close();
		
	}

}
