package lab10;


import java.util.stream.Stream;

public class ProblemFive {

	public static void main(String[] args) {
		Stream<String> ts=Stream.of("ambes","tetemke","tesfay","mybe","yes");
		Stream<String> tst=streamSection(ts,1,3);
		tst.forEach(s->System.out.println(s));

	}
public static Stream<String >streamSection(Stream<String> stream,long m, long n){
	Stream<String> subStream=stream.sequential().skip(m).limit(n);
	
	return subStream;
}
}

