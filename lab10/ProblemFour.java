package lab10;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProblemFour {

	public static void main(String[] args) {
		printSquares(5);

	}
public static void printSquares(final int num){
	IntStream myIntStream=IntStream.iterate(1,n->n+1).limit(num*num);
	myIntStream.map(n->n*n).filter(n->n<=num*num).forEach(s->System.out.println(s+","));
}

}
