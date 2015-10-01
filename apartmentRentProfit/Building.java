package problem2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private List<Apartment> apartments;
	private String buildingName;
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public double getMaintainanceCost() {
		return maintainanceCost;
	}
	public void setMaintainanceCost(double maintainanceCost) {
		this.maintainanceCost = maintainanceCost;
	}
	public double getProfit() {
		return profit;
	}
	public void setProfit(double profit) {
		this.profit = profit;
	}
	private double maintainanceCost;
	private double profit=0;
	//the constructor will create the apartments based on the name of the build pass
	Building(String buildingName,double maintainanceCost){
		this.maintainanceCost=maintainanceCost;
		this. buildingName= buildingName;
		apartments=new ArrayList<Apartment>();
		if(this.buildingName=="b1"){
			for(int x=0; x<400;x++){
				this.addApartment(new Apartment(2000,x));
			}
		}
		else if(this.buildingName=="b2"){
			for(int x=0; x<800;x++){
				this.addApartment(new Apartment(2500,x));
			}
		}
		else if(this.buildingName=="b3"){
			for(int x=0; x<300;x++){
				this.addApartment(new Apartment(1500,x));
			}
		}
		else if(this.buildingName=="b4"){
			for(int x=0; x<200;x++){
				this.addApartment(new Apartment(2500,x));
			}
		}
		else if(this.buildingName=="b5"){
			for(int x=0; x<400;x++){
				this.addApartment(new Apartment(1500,x));
			}
		}
		
		
	}
	public void addApartment(Apartment apt){
		apartments.add(apt);
	}
	public int getNumberOfApartments(){
		return apartments.size();
	}
	public Apartment getApartment(int index){
		return apartments.get(index);
	}

}
