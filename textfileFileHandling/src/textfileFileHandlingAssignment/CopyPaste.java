package textfileFileHandlingAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPaste
{
	public static void main(String[] args) throws IOException
	{
	File f1=new File("../textfileFileHandling/govind.txt");
	File f2=new File("../textfileFileHandling/govind3.txt");
	FileReader fr=new FileReader(f1);
	FileWriter fw=new FileWriter(f2);
	BufferedReader br=new BufferedReader(fr);
	BufferedWriter bw=new BufferedWriter(fw);
	String data;
	while((data=br.readLine())!=null)
	{
		bw.write(data);
		bw.newLine();
	}
	bw.close();
}

}
