package lab6_1new;

public class RedheadDuck extends Duck{
	public void display(){
		System.out.println("RedheadDuck:\n displaying");
		super.display();
	}
	RedheadDuck(FlyBehavior fb,QuackBehavior qb){
		super(fb,qb);
	}

}
