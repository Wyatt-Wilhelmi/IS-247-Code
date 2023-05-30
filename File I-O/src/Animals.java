import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Animals {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File("D://eclipse-workspace//File I-O//src//mypets.txt/");
		
		ArrayList<Dogs> Ds = new ArrayList<>();
		
		
		try {	
			
			Scanner scan = new Scanner(file);
				
			while(scan.hasNext()) {
				
				String hisName = "";
				String hisBreed = "";
				int hisAge = 0;
				int hisAKC = 0;
				boolean hisVaccine = false;
				boolean data = true;
				
				for(int i = 0; i < 5; i++) {
					
					if(i == 0) {
						hisName = scan.next();
					}
					else if (i == 1) {
						hisBreed = scan.next();
					}
					else if (i == 2) {
						try {
							hisAge = scan.nextInt();
						}
						catch(Exception e) {
							data = false;
							System.out.println("One entry was skipped due to an incorrect format");
							scan.next();
							scan.next();
							scan.next();
							break;
						}
							
					}
					else if (i == 3) {
						try {
							hisAKC = scan.nextInt();
						}
						catch(Exception e) {
							data = false;
							System.out.println("One entry was skipped due to an incorrect format");
							scan.next();
							scan.next();
							break;
						}
					}
					else {
						try {
							hisVaccine = scan.nextBoolean();
						}
						catch(Exception e){
							data = false;
							System.out.println("One entry was skipped due to an incorrect format");
							scan.next();
							break;
						}
					}
				}
				if(data) {
					Ds.add(new Dogs(hisName, hisBreed, hisAge, hisAKC, hisVaccine));
					}
			}
			scan.close();
			
			for(int i=0; i<Ds.size(); i++) {
				System.out.println(Ds.get(i).toString());
				}
			
		}
		catch (FileNotFoundException r) {
			System.out.println("Cannot find the file" + r.getLocalizedMessage());
			}
		
			
		}
		
	}
	

