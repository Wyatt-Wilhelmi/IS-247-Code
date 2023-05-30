import java.util.ArrayList;

public class PracticingAbstracts {
	
	abstract class cat {
		public abstract void setName(String name);
		  public abstract void setType(String type);
		  public abstract void setAnimalSound(String sound);
		  public abstract String getName(); 
		  public abstract String getType();
		  public abstract String getAnimalSound();
	}
	public class info extends cat{
		private String name;
		private String type;
		private String sound;
		
		public info() {
			
		}
	  
	  public info(String name, String type, String sound) {
	     this.name = name; 
	     this.type = type;
	     this.sound = sound;
	  	}
	  
	  public void setName(String name) {
			 this.name = name;
			
		}
	 
	  public void setType(String type) {
			 this.type = type;
			
		}
	  
	  public void setAnimalSound(String sound) {
			 this.sound = sound;
			
		}

	  public String getAnimalSound() {
		     return sound;
		  }
	  
	  public String getName() {
	     return name;
	  }
	  
	  public String getType() {
		  return type;
	 
	  }
	}
	public static void main(String[] args) {
		
		 ArrayList<Animal> animals = new ArrayList<Animal>();
	        animals.add(new Dog("Kiki", "Cat", "Meow!"));
	        animals.add(new Dog("Sparta", "Cat", "Meow!")); 
	        animals.add(new Dog("Lucy", "Cat", "Meow!")); 
	               
	        for (Animal animal: animals) 
	        {
	            System.out.println(animal.getName()+ ": " + animal.getType() + ", " + animal.getAnimalSound());
	        }
		}

	}

