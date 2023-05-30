import java.util.ArrayList;

interface Animal {
  public void setName(String name);
  public void setType(String type);
  public void setAnimalSound(String sound);
  public String getName(); 
  public String getType();
  public String getAnimalSound();
}



  public class PracticingInterfaces {

	public static void main(String[] args) {
		 ArrayList<Animal> animals = new ArrayList<Animal>();
	        animals.add(new Dog("Krypto", "Dog", "Woof!"));
	        animals.add(new Dog("Bella", "Dog", "Woof!")); 
	        animals.add(new Dog("Rocky", "Dog", "Woof!")); 
	               
	        for (Animal animal: animals) 
	        {
	            System.out.println(animal.getName()+ ": " + animal.getType() + ", " + animal.getAnimalSound());
	        }
		}
	}
