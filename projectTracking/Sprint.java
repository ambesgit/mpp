package lab1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sprint {
	private String sprintName;
	private int sprintID;
	private int numberOfFeatures;
	private LocalDate startDate;
	private LocalDate endDate;
	private int numberofDevelopers;
	private Release release;
	private List<Developer> developers;
	Sprint(Release release){
		this.release=release;
		developers=new ArrayList<Developer>();
		
	}
	
}
