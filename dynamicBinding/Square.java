package lab5_1;

public class Square extends Shape{
	private double sideLength;

	@Override
	void draw() {
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
