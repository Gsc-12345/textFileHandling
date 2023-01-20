package textfileFileHandlingAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataParticularRow1
{
	public static void main(String[] args) throws IOException 
	{
		File f=new File("../textfileFileHandling/govind.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String data;
		
		int deepak=0;
		while((data=br.readLine())!=null)
		{
			deepak=deepak+1;
			
			int particularLineNumber=3;
			if(deepak==particularLineNumber)
			{
				System.out.println(data);
				break;
			}
			
		}
		
		
	}

}
