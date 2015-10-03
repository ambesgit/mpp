package lab5_2;

public abstract class Shape {
	private String color;
	void draw(){
		System.out.println("Shape.draw()");
	};
	abstract void erase();
	abstract void move();

}
