package lab10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProblemEight {

	public static void main(String[] args) {
		List<EmployeePro> list = Arrays.asList(new EmployeePro("Joe", "Davis", 120000),
		          new EmployeePro("John", "Sims", 110000),
		          new EmployeePro("Joe", "Stevens", 200000),
                new EmployeePro("Andrew", "Reardon", 80000),
                new EmployeePro("Joe", "Cummings", 760000),
                new EmployeePro("Steven", "Walters", 135000),
                new EmployeePro("Thomas", "Blake", 111000),
                new EmployeePro("Alice", "Richards", 101000),
                new EmployeePro("Donald", "Trump", 100000));

//print the number of Employees in list whose salary > 100000 and whose last name begins
//with a letter that comes after the letter 'E'
System.out.println( list.stream().filter(n->n.getLastName().toLowerCase().charAt(0)>'e'&& n.getSalary()>10000).count());
//print a list of sorted full names - all upper case -- of Employees with
//salary > 85000 and whose first name begins with a letter that comes before  the letter 'R'
System.out.println( list.stream().filter(n->n.getFirstName().toLowerCase().charAt(0)<'r'&& n.getSalary()>85000).map(n->n.getFirstName()+" "+n.getLastName()).sorted().collect(Collectors.joining(",")));

LambdaExpressionLibrary.SELECTED_EMPLOYEE_COUNT.apply(list, 'e', 100000);
System.out.println();
LambdaExpressionLibrary.SELECTED_SORTED_EMPLOYEE.apply(list, 'r', 85000);
}

	}
class LambdaExpressionLibrary{
	interface TriFunction<T,N,S>{
		void apply(T t,N n,S s);
	}
	public static final TriFunction<List<EmployeePro>,Character,Integer> SELECTED_EMPLOYEE_COUNT=(list,c,s)->System.out.print(list.stream().filter(n->n.getFirstName().toLowerCase().charAt(0)>c&& n.getSalary()>100000).count());
	public static final TriFunction<List<EmployeePro>,Character,Integer> SELECTED_SORTED_EMPLOYEE=(list,c,s)->System.out.print(list.stream().filter(n->n.getFirstName().toLowerCase().charAt(0)<c&& n.getSalary()>85000).map(n->n.getFirstName()+" "+n.getLastName()).sorted().collect(Collectors.joining(",")));
}


class EmployeePro {
	String firstName, lastName;
	

	int salary;
	public EmployeePro(String f, String l, int s) {
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

