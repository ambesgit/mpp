package lab1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Release {
	private String releaseNmae;	
	private int releaseNumber;
	private LocalDate releaseDate;
	private double versionNumber;
	private String majorMinnor;
	private Project project;
	private List<Sprint> sprint;
	Release(Project project){
		this.project=project;
		sprint=new ArrayList<Sprint>();
		sprint.add(new Sprint(this));
	}

}
