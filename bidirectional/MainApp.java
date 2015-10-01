package problem3bidirectional;

public class MainApp {

	public static void main(String[] args) {
		Cylinder cl=new Cylinder(20.8,10);
		Circle cr=new Circle(20.8,10);
		System.out.println("volume of the cylinder called 'cl': "+cl.getVolume());
		System.out.println("volume of the cylinder created internally by 'cr': "+cr.getCylinder().getVolume());

	}

}
