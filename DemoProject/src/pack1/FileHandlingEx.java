package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandlingEx {

	public static void main(String[] args) throws IOException{
		FileInputStream fis=null;
	try {
			fis=new FileInputStream("xyz.txt");
	}
	catch(FileNotFoundException e)
	{
		System.out.println("File is not found");
			
	}
	
	finally
	{
		if(fis!=null)
		{
			fis.close();
		}
		System.out.println("File is closed");
	}

	}

}













