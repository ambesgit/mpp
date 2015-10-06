package lab6_1new;

public class RubberDuck extends Duck{
	public void display(){
		System.out.println("RubberDuck:\ndisplaying");
		super.display();
	}
	RubberDuck(FlyBehavior fb,QuackBehavior qb){
		super(fb,qb);
	}

}
