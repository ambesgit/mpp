package lab9;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lab9.MathRandomWithInnerClass.FromInnerClass;

public class ProblemOne {

	public static void main(String[] args) {
		MyClass c=new MyClass();
		System.out.println(c.myclass.test(c));
		
		//--------------------------------Test--------------
		List<String> ts=Arrays.asList("Joe","Tom","Abe");
		//Stream<Stream<Character>> result=;
		
		//fuctorial using functional programming
		int xy=4;
		BigInteger st=Stream.iterate(BigInteger.ONE,n->n.add(BigInteger.ONE)).limit(xy).reduce(BigInteger.ONE,BigInteger::multiply).add(Stream.iterate(BigInteger.ONE,n->n.add(BigInteger.ONE)).limit(xy).reduce(BigInteger.ONE,BigInteger::multiply));
		//for question 1 part i(j) using lambda expression
		System.out.println(st.intValue());
		Supplier<Double> random=()->Math.random()*100;
		System.out.println(random.supplier());
		
		//from inner class 
		MathRandomWithInnerClass outer=new MathRandomWithInnerClass();
		System.out.println(outer.inner.supplier());
		

	}

}
//----------------------------------Problem one A-I------------------------
class MathRandomWithInnerClass{
	FromInnerClass inner=new FromInnerClass();
	public class FromInnerClass implements Supplier<Double>{

		@Override
		public Double supplier() {
			
			return Math.random()*100;
		}
		
	}
}//-------------------------------Problem 1 part g----------------------
class MyClass{	

		BiFunction<MyClass> myclass=this::equals;
	
	
	@Override
	public boolean equals(Object obj) {	
		if(this==(MyClass)obj){
			return true;
			
		}
		
		return false;
	}	

}
interface BiFunction<T>{	
	public boolean test(T o2);	
	
}
//-----------------------------------------Problem one  part j(i)---------------------
interface Supplier<T>{
	T supplier();
}
