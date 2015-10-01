package problem2;

public class MainApp {

	public static void main(String[] args) {
		LandLord landLord=new LandLord();
		landLord.addBuilding(new Building("b1",1000.0));
		landLord.addBuilding(new Building("b2",2000.0));
		landLord.addBuilding(new Building("b3",4000.0));
		landLord.addBuilding(new Building("b4",5000.0));
		landLord.addBuilding(new Building("b5",2000.0));
		System.out.println(""+landLord.getNumberOfBuildings());
		System.out.println(""+landLord.getBuilding(1).getNumberOfApartments());
		System.out.println(""+landLord.monthlyProfit());
		

	}

}
