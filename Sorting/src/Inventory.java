
public class Inventory implements Comparable<Inventory>{

	private String name;
	private double cost;
	private int quantity;
	
	public Inventory(String name, double cost, int quantity) {
		super();
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	 public String getName() {
         return name;
	 	}

	 public double getCost() {
         return cost;
 		}

	 public int getQuantity() {
         return quantity;
	 	}

	 
	 public String toString() {
         return "(" + name + ", " + cost + ", " + quantity + ")";
	 	}

	 
	 public int compareTo(Inventory inv) {
         return name.compareTo(inv.name);
	 	}

}

