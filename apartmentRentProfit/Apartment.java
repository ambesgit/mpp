package problem2;

public class Apartment {
	private double rent;
	private int apt_number;
	public double getRent() {
		return rent;
	}
	public int getApt_number() {
		return apt_number;
	}
	public Apartment(double rent, int apt_number){
		this.rent=rent;
		this.apt_number=apt_number;
	}
}
