
public class Dogs extends AnimalInfo {
	private int aKC;
	private boolean vaccine;

	public Dogs(){
		super();
		aKC = 0;
		vaccine = true;
	}
	
	public Dogs(String hisName, String hisBreed, int hisAge, int hisAKC, boolean hisVaccine) {
		super(hisName, hisBreed, hisAge);
		aKC = hisAKC;
		vaccine = hisVaccine;
	}
	
	public void setAKC(int hisAKC) {
		aKC = hisAKC;
	}
	
	public void setVaccine(boolean hisVaccine) {
		vaccine = hisVaccine;
	}
	
	
	public int getAKC() {
		return aKC;
	}
	
	public boolean getVaccine() {
		return vaccine;
	}
	
	public String toString() {
		return super.toString() + " " + getAKC() + " " + getVaccine();
	}
}
