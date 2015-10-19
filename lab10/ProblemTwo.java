package lab10;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ProblemTwo {
public static void main(String[] args){
	PrimeNumbers.printFirstNPrimes(10);
	System.out.println("------------------");
	PrimeNumbers.printFirstNPrimes(5);
}

}
class PrimeNumbers{
	static Stream<BigInteger> primes=Stream.iterate(BigInteger.ONE.add(BigInteger.ONE), n->n.add(BigInteger.ONE)).map(n->n.nextProbablePrime());
	 static void printFirstNPrimes(long m){
		 primes.limit(m).distinct().forEach(s->System.out.println(s));	
		 primes=Stream.iterate(BigInteger.ONE.add(BigInteger.ONE), n->n.add(BigInteger.ONE)).map(n->n.nextProbablePrime());
	
	 }
		
	
}
