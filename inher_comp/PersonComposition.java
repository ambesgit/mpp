package lesson3.labs.prob1;

public class PersonComposition {
	private String name;
	PersonComposition(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object p) {	
		if(p==null) return false;
		if(!(p instanceof PersonComposition))return false;		
		boolean isEqual = (this.getName()).equals(((PersonComposition)p).getName());
		return isEqual;
	}
	public static void main(String[] args) {
		
	}

}
