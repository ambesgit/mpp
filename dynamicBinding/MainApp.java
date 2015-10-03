package lab5_1;

public class MainApp {

	public static void main(String[] args) {		
		//no it didn't work because we can't create object from abstract class
		//Shape sp=new Shape();
		Circle cr=new Circle();
		cr.draw();
		
		Shape tr=new Triangle();
		tr.draw();
		animate(new Circle());
		animate(new Square());
		animate(new Triangle());
	}
	public static void animate(Shape sp){
		sp.draw();
		sp.move();
		sp.draw();
	}

}
