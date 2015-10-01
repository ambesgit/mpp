package lesson3.labs.prob1;

public class PersonWithJobComposition {
private double salary;	
//this will be the reference to the PersonComposition object which will be created 
//by this class's constructor, then the equal method of this object will be used 
//"delegate"
private PersonComposition p;
	public double getSalary() {
		
		return salary;
	}
	PersonWithJobComposition(String n, double s) {
		p=new PersonComposition(n);		
		salary = s;
		
	}
	
	@Override
	public boolean equals(Object person) {
		//call the equals method of the PersonComposition
		return p.equals(person);
	}
	public static void main(String[] args) {
		PersonComposition p1 = new PersonComposition("Joe");
		PersonComposition p2 = new PersonComposition("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


	
}
