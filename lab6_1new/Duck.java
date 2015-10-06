package lab6_1new;

public class Duck {
	private FlyBehavior fb;
	private QuackBehavior qb;
	public void quack(){
		qb.quack();
	}
	public void fly(){
		fb.fly();
	}
	public void swim(){
		System.out.println("Swimming");
	}
	public void display(){
		fly();
		quack();
		swim();
	}
	Duck(FlyBehavior fb, QuackBehavior qb){
		this.fb=fb;
		this.qb=qb;
	}

}
