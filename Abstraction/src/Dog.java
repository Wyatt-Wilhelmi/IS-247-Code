
public class Dog implements Animal {
	private String name;
	private String type;
	private String sound;
	public Dog() {
		
	}
  
  public Dog(String name, String type, String sound) {
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
