package lab6_1;

public class FlyBehavior implements FlyWithWings,CannotFly{

	@Override
	public void fly() {	
		
	}
	public void flyWithWings(){
		System.out.println("  flying with wings");
	}
	public void cannotFly(){
		System.out.println("  can not fly");
	}	

}
