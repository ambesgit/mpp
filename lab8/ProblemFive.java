package lab8;
public class ProblemFive {

	public static void main(String[] args) {
		Duck[] ducks={new MallardDuck(),new RedheadDuck(),
				new DecoyDuck(),new RubberDuck()};
		for(Duck d:ducks){
			d.display();
}

	}

}
class Duck implements FlyBehavior,QuackBehavior{
	public void swim(){
		System.out.println("Swimming");
	}
	public void display(){
		this.fly();
		this.quack();
		this.swim();
	}
	
}
class MallardDuck extends Duck{
	public void display(){
		System.out.println("MallardDuck:\ndisplay");
		super.display();
	}
	@Override
	public void fly(){
		System.out.println("fly with wings");
	}
	@Override
	public void quack() {
		System.out.println("Quacking");
		
	}
}
class RedheadDuck extends Duck{
	public void display(){
		System.out.println("RedheadDuck:\n displaying");
		super.display();
	}
	@Override
	public void fly(){
		System.out.println("fly with wings");
	}
	@Override
	public void quack() {
		System.out.println("Quacking");
		
	}
	
}
class DecoyDuck extends Duck{
	public void display(){
		System.out.println("DecoyDuck:\ndisplaying");
		super.display();
	}
	@Override
	public void fly(){
		System.out.println("can not fly");
	}
	@Override
	public void quack() {
		System.out.println("can not quack");
		
	}
	
}
class RubberDuck extends Duck{
	public void display(){
		System.out.println("RedheadDuck:\n displaying");
		super.display();
	}
	@Override
	public void fly(){
		System.out.println("can not fly");
	}
	@Override
	public void quack() {
		System.out.println("sqeauking");
		
	}
	
}
interface FlyBehavior{
	default void fly() {
		System.out.println("can not fly");		
	}
	
	
}
interface QuackBehavior{
	default void quack() {
		System.out.println("can not quacking");
		
	}
	
}
