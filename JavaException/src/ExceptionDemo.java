import java.util.*;
public class ExceptionDemo {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int x = 0;	
		try {
			System.out.println("Enter and Interger: ");
				x = input.nextInt();
		}
		catch(Exception e){
			System.out.println("Please input an integer!");
		}
		
		System.out.println(x);
		input.close();
	}

}
