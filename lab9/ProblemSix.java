package lab9;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class ProblemSix {

	public static void main(String[] args) {			
		//---------------Test for problem 6 of 2------------------
		LambdaMethodReference lmr=new LambdaMethodReference();
		lmr.evaluator();
		
	}
	

}
class LambdaMethodReference{
	
	void evaluator(){
		Employee e1=new Employee();
		Employee e2=new Employee();
		Apple a=new Apple();
		System.out.println(" 1: "+getName1.getName(e1));
		System.out.println(" 2: "+getName2.getName(e2));
		setName1.setName(e1,"tetemke");
		System.out.println(" after set method : "+getName2.getName(e1));
		System.out.println("Compare two employees: "+compare1.compare(getName1.getName(e1), getName1.getName(e2)));
		System.out.println("power function's result: "+power1.powerFunction(2.0,3));
		System.out.println("give me weight of apple : "+apple1.getWieght(a));
		System.out.println("parsing string to integer: "+parse1.parseInteger("1233"));
		System.out.println("compare two employee objects: "+comp1.apply(e1, e2));
	}
	//A. (Employee e)->e.getName();
	GetNameInterface<Employee> getName1=(Employee e)->e.getName();
	GetNameInterface<Employee> getName2=Employee::getName;
	//method reference type: class:instanceMethod;
	
	
	//B. (Employee e,String s)-> e.setName(s)
	SetNameInterface<Employee,String> setName1=(e,s)->e.setName(s);
	SetNameInterface<Employee,String> setName2=Employee::setName;
	//method reference type: class:instanceMethod;
	
	//C. (String s1, String s2)->s1.compareTo(s2);
	Comparator<String> compare1=(s1,s2)->s1.compareTo(s2);
	Comparator<String> compare2=String::compareTo;
	//method reference type: class:instanceMethod;
	
	
	//D. (Integer x,Integer y) -> Math.pow(x,y)
	MathPower<Double,Integer,Double> power1=(x,y)->Math.pow(x,y);
	MathPower<Double,Integer,Double> power2=Math::pow;
	//method reference type: class:staticMethod;
	
	
	//E. (Apple a) -> a.getWeight()
	AppleInterface<Apple,Double> apple1=(Apple a)->a.getWeight();
	AppleInterface<Apple,Double> apple2=Apple::getWeight;
	//method reference type: class:instatntMethod;
	
	
	//F. (String x) -> Integer.parseInt(x);
	IntegerParse<String> parse1=(String x)->Integer.parseInt(x);
	IntegerParse<String> parse2=Integer::parseInt;
	//method reference type: class:statictMethod;
	
	//G. EmployeeNameComparator comp = new EmployeeNameComparator();
	//(Employee e1, Employee e2) -> comp.compare(e1,e2)
	EmployeeNameComparator comp = new EmployeeNameComparator();
	IEmployeeNameComparator<Employee,Employee,Integer> comp1=(e1,e2)->comp.compare(e1,e2);
	IEmployeeNameComparator<Employee,Employee,Integer> comp2=(e1,e2)->comp.compare(e1,e2);
	//method reference type: class:instatntMethod;
//-------------------------End of problem 6 of one -------------------------------------	
	interface IEmployeeNameComparator<T,S,R>{
		
		R apply(T t,T s);
	}

	
	interface IntegerParse<T>{
		int parseInteger(T t);
	}
	interface AppleInterface<T,R>{
		R getWieght(T t);
	}
	
	interface MathPower<T,S,R>{
		R powerFunction(T t,S s);
	}
	
	interface GetNameInterface<T>{
		String getName(T t);
		
	}
	interface SetNameInterface<T,S>{
		void setName(T t,S s);
		
	}
	class Apple{
		double weight=20.0;
		double getWeight(){
			return this.weight;
		}
	}
	class Employee{
		String name="ambes";
		public String getName(){
			return this.name;
		}
		public void setName(String s){
			this.name=s;
		}
	}
	class EmployeeNameComparator{		
		
		Integer compare(Employee t,Employee s){
			return t.name.compareTo(s.name);
		}
		
	}
	
}
