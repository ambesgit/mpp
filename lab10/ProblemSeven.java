package lab10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class ProblemSeven {
	public static void main(String[] args) {
		List<Employees> list = Arrays.asList(new Employees("Joe", "Davis", 120000),
				          new Employees("John", "Sims", 110000),
				          new Employees("Joe", "Stevens", 200000),
		                  new Employees("Andrew", "Reardon", 80000),
		                  new Employees("Joe", "Cummings", 760000),
		                  new Employees("Steven", "Walters", 135000),
		                  new Employees("Thomas", "Blake", 111000),
		                  new Employees("Alice", "Richards", 101000),
		                  new Employees("Donald", "Trump", 100000));
		
		//your stream pipeline here
		
		System.out.println(list.stream().filter(n->n.getLastName().toLowerCase().charAt(0)>'m'&& n.getSalary()>100000 ).map(n->n.getFirstName()+" "+n.getLastName()).collect(Collectors.joining(",")));
		LambdaLibrary.SELECTED_EMPLOYEES.apply(list, 'm', 100000);
		
	}

}
class LambdaLibrary{
	interface BiFunction<T,C,S>{
		void apply(T t,C c,S s);
	}
	//what are the arguments ...list, searchString and salary
	public final static BiFunction<List<Employees>,Character,Integer> SELECTED_EMPLOYEES=(list,c,s)->System.out.println(list.stream().filter(n->n.getLastName().toLowerCase().charAt(0)>c && n.getSalary()>s ).map(n->n.getFirstName()+" "+n.getLastName()).collect(Collectors.joining(",")));
	
}
class Employees {
	String firstName, lastName;
	int salary;
	public Employees(String f, String l, int s) {
		this.firstName = f;
		this.lastName = l;
		this.salary = s;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("first name: ");
		sb.append(firstName);
		sb.append(" last name: ");
		sb.append(lastName);
		sb.append(" salary: ");
		sb.append("" + salary+">");
		return sb.toString();
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

