package textfileFileHandlingAssignment;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteDataFromUserForEveryLine
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
	
	for(int i=0;i<=endrow;i++)
	{
		if(i<initialrow)
		{
			bw.newLine();
		}
		else
		{
			System.out.println("Please enter data");
			String data=S.nextLine();
			bw.write(data);
			bw.newLine();
		}
	}
	bw.close();
	}
	
}
