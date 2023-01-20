package textfileFileHandlingAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataRange
{
	public static void main(String[] args) throws IOException
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Please enter initial row");
		int intitialrow=S.nextInt();
		System.out.println("please enter end row");
		int endrow=S.nextInt();
		
		File f=new File("../textfileFileHandling/govind.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		String data;
		
		int deepak=0;
		while((data=br.readLine())!=null)
		{
			deepak=deepak+1;
		if((deepak>=intitialrow)&&(deepak<=endrow))
		{
			System.out.println(data);
		}
		}
		
		
	}

}
