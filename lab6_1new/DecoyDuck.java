package lab6_1new;

public class DecoyDuck extends Duck{
	public void display(){
		System.out.println("DecoyDuck:\ndisplaying");
		super.display();
	}
	DecoyDuck(FlyBehavior fb,QuackBehavior qb){
		super(fb,qb);
	}

}
