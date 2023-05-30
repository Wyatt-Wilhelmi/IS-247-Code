import java.io.*;
import java.util.Scanner;

public class Writing {

	public static void main(String[] args) throws IOException {
		
		String name;
		String fileName;
		int age;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What would you like to call this file: ");
			fileName = input.nextLine();
			
			FileWriter fileWriter = null;
		
		try {	
			fileWriter = new FileWriter(fileName);
			}	
		catch (IOException e) {
			e.printStackTrace();
		}
		
		PrintWriter outputFile = new PrintWriter(fileWriter);
		
		System.out.print("What is your name: ");
		name = input.next();
		
		System.out.print("What is your age: ");
			age = input.nextInt();
		
			outputFile.printf("Age is %d \n", age);
			outputFile.print(name);
			
			
			
		outputFile.close();	
		input.close();
		System.out.println("File created.");
	}

}
