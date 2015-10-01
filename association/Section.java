package prob2C;

import java.util.ArrayList;
import java.util.List;

import prob2A.Student;

public class Section {
	private String sectionName;
	private List<Student>student;
	public Section(String sectionName){
		this.sectionName=sectionName;
		student=new ArrayList<Student>();
	}
}
