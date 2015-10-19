package lab8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class ProblemOne {

	public static void main(String[] args) {
		

	}

}

//----------------ProblemOne B------------------------
//
//class Employee {
//	private String name;
//	private int salary;
//	public Employee(String name, int salary) {
//		this.name = name;
//		this.salary = salary;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	@Override 
//	public String toString() {
//		return "(" + name + ", " + salary + ")";
//	}
//	
//	public boolean equals(Employee e) {
//		return e.name.equals(name) && e.salary == salary;
//	}
//}
//
//
//
//class EmployeeInfo {
//	
//	
//	/**
//	 * Removes all duplicate Employee instances from input list (only a copy is modified)
//	 * An Employee instance is considered to be a duplicate of another Employee
//	 * instance if the two instances have the same name and salary.
//	 */
//	public static List<Employee> removeDuplicates(List<Employee> employees) {
//		List<Employee> noDupsList = new ArrayList<>();
//		noDupsList.add(employees.get(0));
//		for(int i = 1; i < employees.size(); ++i) {
//			if(!inList(employees.get(i), noDupsList)) {
//				noDupsList.add(employees.get(i));
//			}
//		}
//		return noDupsList;
//	}
//	
//	/** Returns true if e is in the list emps, false otherwise */
//	private static boolean inList(Employee e, List<Employee> emps) {
//		for(Employee emp : emps) {
//			if(e.equals(emp)) return true;
//		}
//		return false;
//	}
//	
//	/**
//	 * Tests to see if solution is correct
//	 * What's wrong here?
//	 */
//	public static void main(String[] args) {	
//		List<Employee> list = new ArrayList<Employee>() {
//			{
//				add(new Employee("Richard", 55000));
//				add(new Employee("Richard", 55000));
//				add(new Employee("John", 30000));
//				add(new Employee("Steve", 30000));
//				add(new Employee("Zeke", 50000));
//				add(new Employee("Reggie", 50000));
//				add(new Employee("Steve", 30000));
//				add(new Employee("John", 70000));
//				add(new Employee("Harold", 55000));
//				add(new Employee("Richard", 55000));
//				add(new Employee("Richard", 55000));
//				add(new Employee("Richard", 60000));
//				add(new Employee("Dennis", 80000));
//				add(new Employee("Adam", 80000));
//				add(new Employee("John", 70000));
//				add(new Employee("Charles", 25000));
//				add(new Employee("Bill", 60000));
//				add(new Employee("Bob", 60000));
//				add(new Employee("Bill", 70000));
//				add(new Employee("Bob", 60000));
//			}
//		};
//		
//		//List with duplicates removed - correctly computed
//		List<Employee> dupsRemoved = new ArrayList<Employee>() {
//			{
//				add(new Employee("Richard", 55000));
//				add(new Employee("John", 30000));
//				add(new Employee("Steve", 30000));
//				add(new Employee("Zeke", 50000));
//				add(new Employee("Reggie", 50000));
//				add(new Employee("John", 70000));
//				add(new Employee("Harold", 55000));
//				add(new Employee("Richard", 60000));
//				add(new Employee("Dennis", 80000));
//				add(new Employee("Adam", 80000));
//				add(new Employee("Charles", 25000));
//				add(new Employee("Bill", 60000));
//				add(new Employee("Bill", 70000));
//				add(new Employee("Bob", 60000));
//			}
//		};
//		System.out.println(new String("ambes").equals(new String("ambes")));
//		List<Employee> answer = removeDuplicates(list);
//		System.out.println("Is answer correct? " + listsAreEqual(answer, dupsRemoved));
//	}
//	
//	/**
//	 * Returns true if the two lists have the same size and contain exactly the same
//	 * elements (this is just set equality)
//	 */
//	public static boolean listsAreEqual(List<Employee> l1, List<Employee> l2) {
//		if(l1.size() != l2.size()) return false;
//		for(Employee e : l1) {
//			if(!l2.contains(e)) return false;
//		}
//		return true;
//	}
//
//	 
//}


//----------------ProblemOne C------------------------
//
//class Employee {
//	private String name;
//	private int salary;
//	public Employee(String name, int salary) {
//		this.name = name;
//		this.salary = salary;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}
//	@Override 
//	public String toString() {
//		return "(" + name + ", " + salary + ")";
//	}
//	
//	@Override
//	public boolean equals(Object ob) {
//		if(ob == null) return false;
//		if(!(ob instanceof Employee)) return false;
//		Employee emp = (Employee)ob;
//		return emp.name.equals(name) && emp.salary == salary;
//	}
//		// i added this method so the code gives me the right answer 
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return this.name.hashCode();
//	}
//	
//	
//}
//
//class EmployeeInfo {
//	
//	
//	/**
//	 * Removes all duplicate Employee instances from input list (only a copy is modified)
//	 * An Employee instance is considered to be a duplicate of another Employee
//	 * instance if the two instances have the same name and salary.
//	 */
//	public static List<Employee> removeDuplicates(List<Employee> employees) {
//		HashMap<Employee, Employee> tracker = new HashMap<>();
//		List<Employee> noDupsList = new ArrayList<>();
//		for(int i = 0; i < employees.size(); ++i) {
//			Employee e = employees.get(i);
//			if(!tracker.containsKey(e)) {
//				tracker.put(e, e);
//				noDupsList.add(e);
//			}
//		}
//		return noDupsList;
//	}
//	
//	
//	
//	/**
//	 * Tests to see if solution is correct
//	 * What's wrong here?
//	 */
//	public static void main(String[] args) {	
//		List<Employee> list = new ArrayList<Employee>() {
//			{
//				add(new Employee("Richard", 55000));
//				add(new Employee("Richard", 55000));
//				add(new Employee("John", 30000));
//				add(new Employee("Steve", 30000));
//				add(new Employee("Zeke", 50000));
//				add(new Employee("Reggie", 50000));
//				add(new Employee("Steve", 30000));
//				add(new Employee("John", 70000));
//				add(new Employee("Harold", 55000));
//				add(new Employee("Richard", 55000));
//				add(new Employee("Richard", 55000));
//				add(new Employee("Richard", 60000));
//				add(new Employee("Dennis", 80000));
//				add(new Employee("Adam", 80000));
//				add(new Employee("John", 70000));
//				add(new Employee("Charles", 25000));
//				add(new Employee("Bill", 60000));
//				add(new Employee("Bob", 60000));
//				add(new Employee("Bill", 70000));
//				add(new Employee("Bob", 60000));
//			}
//		};
//		
//		//List with duplicates removed - correctly computed
//		List<Employee> dupsRemoved = new ArrayList<Employee>() {
//			{
//				add(new Employee("Richard", 55000));
//				add(new Employee("John", 30000));
//				add(new Employee("Steve", 30000));
//				add(new Employee("Zeke", 50000));
//				add(new Employee("Reggie", 50000));
//				add(new Employee("John", 70000));
//				add(new Employee("Harold", 55000));
//				add(new Employee("Richard", 60000));
//				add(new Employee("Dennis", 80000));
//				add(new Employee("Adam", 80000));
//				add(new Employee("Charles", 25000));
//				add(new Employee("Bill", 60000));
//				add(new Employee("Bill", 70000));
//				add(new Employee("Bob", 60000));
//			}
//		};
//
//		List<Employee> answer = removeDuplicates(list);
//		System.out.println("Is answer correct? " + listsAreEqual(answer, dupsRemoved));
//	}
//	
//	/**
//	 * Returns true if the two lists have the same size and contain exactly the same
//	 * elements (this is really just set equality)
//	 */
//	public static boolean listsAreEqual(List<Employee> l1, List<Employee> l2) {
//		if(l1.size() != l2.size()) return false;
//		for(Employee e : l1) {
//			if(!l2.contains(e)) return false;
//		}
//		return true;
//	}
//
//	 
//}

//----------------ProblemOne D------------------------

 class Employee {
	private String name;
	private int salary;
	private boolean visited = false;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void setVisited(boolean b) {
		visited = b;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Employee)) return false;
		Employee emp = (Employee)ob;
		return emp.name.equals(name) && emp.salary == salary && emp.visited == visited;
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		long longval = Double.doubleToLongBits(salary);
		int salaryHash = (int) (longval ^ (longval >>> 32));
		result += 31 * result + name.hashCode();
		result += 31 * result + salaryHash;
		result += 31 * result + (visited ? 1 : 0);
		return result;
	}
}
 class EmployeeInfo {
		
		
		/**
		 * Removes all duplicate Employee instances from input list (only a copy is modified)
		 * An Employee instance is considered to be a duplicate of another Employee
		 * instance if the two instances have the same name and salary.
		 */
		public static List<Employee> removeDuplicates(List<Employee> employees) {
			HashMap<Employee, Employee> tracker = new HashMap<>();
			List<Employee> noDupsList = new ArrayList<>();
			for(int i = 0; i < employees.size(); ++i) {
				Employee e = employees.get(i);
				if(!tracker.containsKey(e)) {
					tracker.put(e, e);
					noDupsList.add(e);
				} else {
					tracker.get(e).setVisited(true);
				}
			}
			return noDupsList;
		}
		
		
		
		/**
		 * Tests to see if solution is correct
		 * What's wrong here?
		 */
		public static void main(String[] args) {	
			List<Employee> list = new ArrayList<Employee>() {
				{
					add(new Employee("Richard", 55000));
					add(new Employee("Richard", 55000));
					add(new Employee("John", 30000));
					add(new Employee("Steve", 30000));
					add(new Employee("Zeke", 50000));
					add(new Employee("Reggie", 50000));
					add(new Employee("Steve", 30000));
					add(new Employee("John", 70000));
					add(new Employee("Harold", 55000));
					add(new Employee("Richard", 55000));
					add(new Employee("Richard", 55000));
					add(new Employee("Richard", 60000));
					add(new Employee("Dennis", 80000));
					add(new Employee("Adam", 80000));
					add(new Employee("John", 70000));
					add(new Employee("Charles", 25000));
					add(new Employee("Bill", 60000));
					add(new Employee("Bob", 60000));
					add(new Employee("Bill", 70000));
					add(new Employee("Bob", 60000));
				}
			};
			
			//List with duplicates removed - correctly computed
			List<Employee> dupsRemoved = new ArrayList<Employee>() {
				{
					add(new Employee("Richard", 55000));
					add(new Employee("John", 30000));
					add(new Employee("Steve", 30000));
					add(new Employee("Zeke", 50000));
					add(new Employee("Reggie", 50000));
					add(new Employee("John", 70000));
					add(new Employee("Harold", 55000));
					add(new Employee("Richard", 60000));
					add(new Employee("Dennis", 80000));
					add(new Employee("Adam", 80000));
					add(new Employee("Charles", 25000));
					add(new Employee("Bill", 60000));
					add(new Employee("Bill", 70000));
					add(new Employee("Bob", 60000));
				}
			};

			List<Employee> answer = removeDuplicates(list);
			System.out.println("Is answer correct? " + listsAreEqual(answer, dupsRemoved));
		}
		
		/**
		 * Returns true if the two lists have the same size and contain exactly the same
		 * elements (this is really just set equality)
		 */
		public static boolean listsAreEqual(List<Employee> l1, List<Employee> l2) {
			if(l1.size() != l2.size()) return false;
			for(Employee e : l1) {
				if(!l2.contains(e)) return false;
			}
			return true;
		}

		 
	}


