package lab8;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;

public class ProblemFour {
	public static void main(String[] args){
		ForEachExample.main();
		
	}

}
class ForEachExample {
	@SuppressWarnings("unused")
	public static void main() {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		//implement a Consumer
		Consumer<String> consumer=new Consumer<String>(){

			@Override
			public void accept(String s) {
				System.out.println(s.toUpperCase());
				
			}
			
		};
		
		//print each element of the list in upper case format
		list.forEach(s->System.out.println(s));
		
		
		
	}
	
	
	
	
	
}