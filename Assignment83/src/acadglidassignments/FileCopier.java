/**
 * 
 */
package acadglidassignments;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author nikhil
 * Program to copy from one file to another
 */
public class FileCopier {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- args
	 * Return Type - void
	 */
	public static void main(String[] args) throws IOException
	{
		FileReader objFileReader;
		FileWriter objFileWriter;
		try
		{
				
					Scanner objScanner = new Scanner(System.in); // scanner object to take user input
					System.out.println("Please enter Path of File you want to copy wth file name");
					String filePath = objScanner.next(); // Read path of .txt file from user
					System.out.println("Please enter name  of File and proper path where you want to generate copy or just enter file name to create it in default location");
					objFileReader = new FileReader(filePath);
					String outPutFilename = objScanner.next(); // Take user input for out put file name and text
					objFileWriter = new FileWriter(outPutFilename);
					File objFile = new File(outPutFilename);
					int i;
					while((i=objFileReader.read()) != -1) // iterating till end of file
					{
						char ch = (char)i;
						objFileWriter.write(ch);
					}
					System.out.println("File has been succesfully copied at---" + objFile.getAbsolutePath());
					objFileReader.close();
					objFileWriter.close();
					objScanner.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
