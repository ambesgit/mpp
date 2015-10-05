package lab6_3;

import java.text.DecimalFormat;

public class MainApp {

	public static void main(String[] args) {
		double sum=0.0;
		IComputeArea[] shapes={new Triangle(10.0,8.0),new Rectangle(20,19),new Circle(8)};
		for(IComputeArea s:shapes){
			sum+=s.computeArea();
		}
		DecimalFormat df=new DecimalFormat("#.00");
		System.out.printf("Sum of the Areas = "+df.format(sum));

	}

}
