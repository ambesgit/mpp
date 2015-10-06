package lab6_1new;

public class MainApp {

	public static void main(String[] args) {
		Duck[] ducks={	new MallardDuck(new FlyWithWings(),new Quack()),
						new RedheadDuck(new FlyWithWings(),new Quack()),
						new DecoyDuck(new CannotFly(),new MuteQuack()),
						new RubberDuck(new CannotFly(),new Squeak())};
		for(Duck d:ducks){
			d.display();
		}

	}

}
