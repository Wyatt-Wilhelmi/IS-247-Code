
public class AnimalInfo {
	public String name;
	public String breed;
	public int age;
	
	//Default Constructor
	public AnimalInfo() {
		name = "";
		breed = "";
		age = 0;
	}
	
	public AnimalInfo(String hisName, String hisBreed, int hisAge) {
		name = hisName;
		breed = hisBreed;
		age = hisAge;
	}
	
	
	public void setName(String hisName) {
		name = hisName;
	}
	
	public void setBreed(String hisBreed) {
		breed = hisBreed;
	}
	
	public void setAge(int hisAge) {
		age = hisAge;
	}
	
	
	//Getters
	public String getName() {
		return name;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return getName() + " " + getBreed() + " " + getAge();
	}
	
}