package lab6_3;

public class Rectangle implements IComputeArea{
	private double width;
	private double length;
	public double computeArea(){
		return getWidth()*getLength();
	}
	Rectangle(double width,double length){
		this.width=width;
		this.length=length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}

}
