package lab6_1new;

public class MallardDuck extends Duck{
	public void display(){
		System.out.println("MallardDuck:\ndisplay");
		super.display();
	}
	MallardDuck(FlyBehavior fb,QuackBehavior qb){
		super(fb,qb);
	}

}
