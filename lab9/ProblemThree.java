package lab9;

import java.util.ArrayList;
import java.util.List;

public class ProblemThree {

	public static void main(String[] args) {
		//-------------------------for problem 3 --------
		BiFunctionThree<Double,Double,Double> list=(x,y)->{
			List<Double> temp=new ArrayList<>();
			temp.add(Math.pow(x, y));
			temp.add(x*y);
			return temp;
				
		};
		System.out.println(list.accept(2.0, 3.0));

	}

}
//---------------------------------Problem 3 -------------------------------
interface BiFunctionThree<T,S,R>{
	List<R>accept(T t,S s);
	
}

