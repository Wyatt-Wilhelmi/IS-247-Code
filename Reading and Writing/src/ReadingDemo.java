import java.io.*;
import java.util.Scanner;

public class ReadingDemo {
	
	public static void main(String[] args) {
		
		File text = new File("D:\\eclipse-workspace\\Reading and Writing\\src\\jerry.txt");
		
	try(Scanner scnr = new Scanner(text)){
		
			int lineNumber = 0;
			while(scnr.hasNextLine()) {
				String line = scnr.nextLine();
				System.out.println(line);
				lineNumber++;
			}
	}
	catch (FileNotFoundException e)	{
		System.out.println("File not found!");
	}
	
	}
}
