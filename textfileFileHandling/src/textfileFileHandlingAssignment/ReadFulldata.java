package textfileFileHandlingAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFulldata 
{
	public static void main(String[] args) throws IOException
	{
		File f=new File("../textfileFileHandling/govind.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String data;
		
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}
		
		
		
	}

}
