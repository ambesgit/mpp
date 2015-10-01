package problem3bidirectional;

public class Cylinder {
	private double height=0.0;
	private Circle circle=null;
	
	//constructors-----------------------------Start
	Cylinder(double height,double radius){
		this.height=height;
		circle=new Circle(radius,this);
	}
	Cylinder(double height,Circle circle){
		this.height=height;
		this.circle=circle;
	}
	//setters and getters----------------Start
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	//-----------------------------------End
	public double getVolume(){
		return this.circle.getArea()*this.getHeight();
	}

}
