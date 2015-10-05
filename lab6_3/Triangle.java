package lab6_3;

public class Triangle implements IComputeArea{
	private double base;
	private double height;
	
	Triangle(double base,double height){
		this.base=base;
		this.height=height;
	}
	public double computeArea(){
		return getBase()*getHeight()*0.5;
	}	
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}

}
