package problem2;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
	private List<Building> buildings;
	private double monthlyProfit;
	LandLord(){
		buildings=new ArrayList<Building>();
	}
	public void setMonthlyProfit(double monthlyProfit) {
		this.monthlyProfit = monthlyProfit;
	}
	public double getMonthlyProfit() {
		return monthlyProfit;
	}
	public void addBuilding(Building blg){
		buildings.add(blg);
	}
	public int getNumberOfBuildings(){
		return buildings.size();
	}
	public Building getBuilding(int index){
		return buildings.get(index);
	}
	public double monthlyProfit(){
		double sumRent=0;
		double sumMaintainance=0;
		for(int x=0; x<this.getNumberOfBuildings();x++){
			Building currentBuilding=this.getBuilding(x);
			for(int i=0;i<currentBuilding.getNumberOfApartments();i++){
				sumRent+=currentBuilding.getApartment(i).getRent();
				
			}
			sumMaintainance+=currentBuilding.getMaintainanceCost();
		}
		return sumRent-sumMaintainance;
	}
	
}
