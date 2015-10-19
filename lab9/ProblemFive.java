package lab9;

import java.util.Arrays;
import java.util.List;

public class ProblemFive {

	public static void main(String[] args) {		
		List<String> lis = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		ReplaceConsumer con=new ReplaceConsumer();
			IConsumer<String> ic1=(String s)->con.printName(s);
			IConsumer<String> ic2=con::printName;
			System.out.println("for problem 5 of A:-------------------");
			lis.forEach(s->ic1.accept(s));
			System.out.println("for problem 5 of B:-------------------");
			lis.forEach(s->ic2.accept(s));

	}

}

interface IConsumer<T>{
	void accept(T t);
}
class ReplaceConsumer{
	void printName(String t){
		System.out.println(t);
		}
}