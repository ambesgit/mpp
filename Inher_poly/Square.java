package lab5_2;

public class Square extends Shape{
	private double sideLength;

	@Override
	void draw() {
		super.draw();
		System.out.println("Square.draw()");		
		}
	@Override
	void erase() {
		System.out.println("Square.erase()");		
	}
	@Override
	void move() {
		System.out.println("Square.move()");
		
	}

}
