package lab10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProblemSix {

	public static void main(String[] args) {
		Set<String> set1=new TreeSet<>();
		set1.add("ambes");
		set1.add("tetemke");
		set1.add("adu");
		List<Set<String>> list=new ArrayList();
		list.add(set1);
		Set<String> set2=new TreeSet<>();	
		set2.add("jhon");
		set2.add("Math");
		set2.add("chris");
		list.add(set2);
		System.out.println(union(list));
		
	}
public static Set<String> union(List<Set<String>> sets){//
	Set set=sets.stream().flatMap(n->n.stream()).collect(Collectors.toSet());

	return set;
}
}
