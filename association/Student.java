package prob2A;

import java.util.ArrayList;
import java.util.List;

import prob2C.Section;

public class Student {
	private String name;
	private GradeReport gradeReport;	
	private List sectionList;
	public Student(String name){
		this.name=name;
		gradeReport=new GradeReport(this);		
		sectionList=new ArrayList<Section>();
		sectionList.add(new Section("section1"));
		
		
	}
}
