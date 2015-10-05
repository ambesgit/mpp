package lab6_2;

import java.time.LocalDate;

final public class Person {
	private String name;
	private BirthInfo birthInfo;
	//creator
	Person(String name,LocalDate dob){
		this.name=name;
		birthInfo=new BirthInfo(dob,this);
	}
	//receiver
	Person(String name,BirthInfo birthInfo){
		this.name=name;
		this.birthInfo=birthInfo;
	}
	//factory
	public static Person factoryOfPerson(String name,LocalDate dob){
		
		
		return new Person(name,dob);
	}
	
	//getters
	public String getName() {
		return name;
	}
	public BirthInfo getBirthInfo() {
		return birthInfo;
	}
}
