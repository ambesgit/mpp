package lab5_2;

public class Triangle extends Shape{
	private double sideA;
	private double sideB;
	private double sideC;

	@Override
	void draw() {
		super.draw();
		System.out.println("Trainging.draw()");
		
	}

	@Override
	void erase() {
		System.out.println("Trainging.erase()");
		
	}

	@Override
	void move() {
		System.out.println("Trainging.move()");
		
	}
	

}
