package problem3bidirectional;

public class Circle {
	private double radius=0.0;
	private Cylinder cylinder=null;
	
	//constructors -----------------Start
	Circle(double radius, Cylinder cylinder){
		this.radius=radius;
		this.cylinder=cylinder;
	}
	Circle(double height, double radius){
		this.radius=radius;
		cylinder=new Cylinder(height,this);
	}
	//-------------------------------------End
	
	//getter and setter -------------------Start
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Cylinder getCylinder() {
		return cylinder;
	}
	public void setCylinder(Cylinder cylinder) {
		this.cylinder = cylinder;
	}
	//-------------------------------------------End
	
	//instant methods---------------------------Start
	public double getArea(){
		return this.getRadius()*this.getRadius()*Math.PI;
	}

}
