package lab5_2;

public class MainApp {

	public static void main(String[] args) {		
		
		animate(new Circle());
		animate(new Square());
		animate(new Triangle());
	}
	public static void animate(Shape sp){
		sp.draw();
		
	}

}
