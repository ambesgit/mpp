package lab6_1;

public class Duck {
	private QuackBehavior quackBehavior;
	private FlyBehavior flyBehavior;	
	void display(){
		
	}
	void swim(){
		System.out.println("  swimming");
		
	}
	
	void quack(){
		if((this.getClass().getSimpleName()).trim().equals("RubberDuck")){
			quackBehavior.canSqueak();
		}
		else if(this.getClass().getSimpleName().equals("RedheadDuck")){
			quackBehavior.canQuack();
		}
		else if(this.getClass().getSimpleName().equals("DecoyDuck")){
			quackBehavior.cannotQuack();
		}
		else if(this.getClass().getSimpleName().equals("MallardDuck")){
			quackBehavior.canQuack();
		}
		else{
			System.out.println(this.getClass().getSimpleName());		
			
		}	
	}
	
		
	void fly(){
		if((this.getClass().getSimpleName()).trim().equals("RubberDuck")){
			flyBehavior.cannotFly();
		}
		else if(this.getClass().getSimpleName().equals("RedheadDuck")){
			flyBehavior.flyWithWings();
		}
		else if(this.getClass().getSimpleName().equals("DecoyDuck")){
			flyBehavior.cannotFly();
		}
		else if(this.getClass().getSimpleName().equals("MallardDuck")){
			flyBehavior.flyWithWings();
		}
		else{
			System.out.println(this.getClass().getSimpleName());		
			
		}		
		
	}
	QuackBehavior getQuackBehavior(){
		return quackBehavior;
	}
	
	Duck(){
		flyBehavior=new FlyBehavior();
		 quackBehavior=new QuackBehavior();
	}

}
