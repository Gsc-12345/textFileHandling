package textfileFileHandlingAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteDatafromUser1stBlank
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("../textfileFileHandling/govind3.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		System.out.println("please Enter Initial row");
		Scanner S=new Scanner(System.in);
		int initialrow=S.nextInt();
		System.out.println("please Enter endrow");
		int endrow=S.nextInt();
		System.out.println("Please enter data");
		String data=S.next();
		
		for(int i=1;i<=endrow;i++)
		{
			if(i<=initialrow)
			{
				bw.newLine();
			}
			else
			{
				bw.write(data);
				bw.newLine();
			}
		}
		bw.close();
		
		
		
	}

}
