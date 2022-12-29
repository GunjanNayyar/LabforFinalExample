package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ReadWriteFileMethods {
	void read() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("xyz.txt");
	}
	void write() throws FileNotFoundException
	{
		String s="Hello how are you?";
				FileOutputStream fos=new FileOutputStream("xyz.txt");
	}

}
public class ReadWriteFile
{
	public static void main(String args[])
	{
		ReadWriteFileMethods rw=new ReadWriteFileMethods();
		try {
			rw.read();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("File handling is done");
	}
}
