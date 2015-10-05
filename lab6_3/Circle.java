package lab6_3;

public class Circle implements IComputeArea{
	private double radius;
	public double computeArea(){
		return Math.PI*getRadius()*getRadius();
	}
	Circle(double radius){
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}


}
