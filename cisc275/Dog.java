package comparing;


public class Dog extends Animal {
	
	public Dog(String n, int l) {
		super();
		this.name = n;
		this.legs = l;
	}
	
	public String toString() {
		return this.name + " " + this.legs;
	}
	
	
	
}

