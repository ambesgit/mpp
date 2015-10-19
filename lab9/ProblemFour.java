package lab9;

import java.util.ArrayList;
import java.util.List;

public class ProblemFour {

	public static void main(String[] args) {

		//--------------------for problem four  Good solution-------------------------
		List<String> words=new ArrayList();
		words.add("chair");
		words.add("char");
		words.add("dcha");
		System.out.println("from proble four: "+Count.countWords(words, 'c', 'd', 4));
		//--------------------for problem four  Best solution-------------------------
		
		

	}

}
//----------------------------Problem 4---------------------------------------

//interface TriFunction<S,T,U,V>{ V apply(S a,T b,U c);}
//static TriFunction<Character, Character,Integer,Predicate<String>> myfun=(c,d)
class Count{
	public static long countWords(List<String> words,char c,char d,int len){
		return words.stream().filter(word->word.contains(""+c)&&!(word.contains(""+d))&&(word.length()==len)).count();		
	}
}

