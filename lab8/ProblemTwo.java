package lab8;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProblemTwo {
	public static void main(String[] args) {
		DataMiner dm = new DataMiner();
		dm.objects.add(new Rectangle(5,7));
		dm.objects.add(new Rectangle(2,9));
		dm.objects.add(new Circle(6));
		dm.objects.add(new EquilateralTriangle(5));
		dm.objects.add(new Ellipse(10,4));
		DecimalFormat d=new DecimalFormat("##00.00");
		System.out.println(d.format((dm.computeAveragePerimeter())));
	}
	
}
class DataMiner {
	List<ClosedCurve> objects = new ArrayList<>();	
	//OO (good) way of performing computation
	public double computeAveragePerimeter() {
		if(objects == null || objects.isEmpty()) return 0.0;
		double sum = 0.0;
		for(int i = 0; i < objects.size(); ++i) {
			sum += objects.get(i).computePerimeter();
		}
		return sum/objects.size();
	}

}

interface Polygone{
	
	default double getSide(double[] sides){
		return Arrays.stream(sides).reduce(0,(s1,s2)->s1+s2);
		
	}
}
interface ClosedCurve {
	public double computePerimeter();
}

class Circle implements Polygone,ClosedCurve {
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius;
	}
}



class Rectangle implements Polygone,ClosedCurve {
	private double length,width;
	private double sides[]=new double[4];

	public Rectangle(double length, double width) {
		sides[0]=length;
		sides[1]=length;
		sides[2]= width;
		sides[3]= width;		
	}

	@Override
	public double computePerimeter() {
		return getSide(sides);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
		sides[0]=length;
		sides[1]=length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		sides[2]=width;
		sides[3]=width;
		
	}
}
class EquilateralTriangle implements Polygone,ClosedCurve{
	private double side;
	double[] sides=new double[3];
	EquilateralTriangle(double s1){
		side=s1;	
		sides[0]=s1;
		sides[1]=s1;
		sides[2]=s1;
	}
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side = side;	
		sides[0]=side;
		sides[1]=side;
		sides[2]=side;
	}
	
	@Override
	public double computePerimeter() {		
		return getSide(sides);
	}
	
	
}
class  Ellipse implements Polygone,ClosedCurve {
	private double semi_major_axis;
	private double elliptic_ellipse_eccentricity;
	/*
	s 4aE where a is the length of the semi-major
	axis and E is the value of the elliptic integral evaluated at the ellipse’s eccentricity. You do not need
	to know these technical concepts; just include a and E as instance variables in your class, of type
	double, and include them as arguments to the Ellipse constructor. 
	 */
	Ellipse(double a,double e){
		semi_major_axis=a;
		elliptic_ellipse_eccentricity=e;
		
	}
	
	@Override
	public double computePerimeter() {
		
		return 4*elliptic_ellipse_eccentricity*semi_major_axis;
	}

	public double getSemi_major_axis() {
		return semi_major_axis;
	}

	public void setSemi_major_axis(double semi_major_axis) {
		this.semi_major_axis = semi_major_axis;
	}

	public double getElliptic_ellipse_eccentricity() {
		return elliptic_ellipse_eccentricity;
	}

	public void setElliptic_ellipse_eccentricity(double elliptic_ellipse_eccentricity) {
		this.elliptic_ellipse_eccentricity = elliptic_ellipse_eccentricity;
	}
	
}



