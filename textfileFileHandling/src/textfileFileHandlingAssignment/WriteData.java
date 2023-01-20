package textfileFileHandlingAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteData 
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("../textfileFileHandling/govind3.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		  System.out.println("Please enter rowCount No.");
			Scanner S=new Scanner(System.in);
			int rowcount=S.nextInt();
			System.out.println("Please enter data");
			String data=S.next();
			
			for(int i=0;i<=rowcount;i++)
			{
				if(i>0)
				{
					bw.write(data);
					bw.newLine();
				}
			}
			  bw.close();
	 }

}
