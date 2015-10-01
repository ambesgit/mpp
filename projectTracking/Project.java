package lab1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Project {
	private String projectDescription;
	private String projectName;
	private int projectID;
	private LocalDate startDate;
	private LocalDate endDate;
	private int numberOfSprints;
	private String projectOwner;
	private List<Release> releases;
	Project( String projectDescription,String projectName,
			int projectID,LocalDate startDate,LocalDate endDate,
			int numberOfSprints,String projectOwner){
		//instantiation of fields
		this.projectDescription=projectDescription;
		this.projectName=projectName;
		this.projectID=projectID;
		this.startDate=startDate;
		this. endDate= endDate;
		this. numberOfSprints= numberOfSprints;
		this.projectOwner=projectOwner;
		//creating a container to track release object
		releases=new ArrayList<Release>();
		releases.add(new Release(this));
	}

}
