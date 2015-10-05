package lab6_1;

public class QuackBehavior implements Quack,Squeak,MuteQuack {

	@Override
	public void quack() {
				
	}
	void cannotQuack(){
		System.out.println("  can not quack");
	}
	void canQuack(){
		System.out.println("  quacking");
	}
	void canSqueak(){
		System.out.println("  squeaking");
	}

}
