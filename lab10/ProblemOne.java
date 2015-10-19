package lab10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProblemOne {

	public static void main(String[] args) {
		
		Stream<String> st=Stream.generate(()->"echo").limit(5);
		st.forEach(s->System.out.println(s));
		//-----------------------ProblemOne part A------------------------
		IntStream ones = IntStream.generate(() -> 1).limit(20).distinct();
		ones.forEach(System.out::println);
		//-----------------------ProblemOne part B------------------------
		Stream<String> stringStream=Arrays.asList("Bill","Thomas","Mary").stream().sequential();
		System.out.println(stringStream.collect(Collectors.joining(",")));
		//-----------------------ProblemOne part C------------------------		
		Stream<Integer> ints=Stream.of(10,20,30,40,50);		
		IntSummaryStatistics s=ints.collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(s.getMax());
		System.out.println(s.getMin());
		
	}
	
	public static final Comparator<Integer> comp=new Comparator<Integer>(){

		@Override
		public int compare(Integer n, Integer m) {
			if(n>m){ 
				return 1;}
			else if(n==m){
					return 0;
					}
			else{
				return -1;
				}
			
		}
		
		
	
	};
}

