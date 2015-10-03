package lab5_2;

public class Circle extends Shape{
	private double radius;

	@Override
	void draw() {
		super.draw();
		System.out.println("Circle.draw()");
		
		
	}

	@Override
	void erase() {
		System.out.println("Circle.erase()");
		
		
	}

	@Override
	void move() {
		
		System.out.println("Circle.move()");
		
	}

}
