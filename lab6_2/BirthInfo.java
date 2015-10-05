package lab6_2;

import java.time.LocalDate;

final public class BirthInfo {
	private LocalDate dateOfBirth;
	private Person person;
	
	//creator
	BirthInfo(LocalDate dob,String name){
		dateOfBirth=dob;
		person=new Person(name,this);
	}
	//receiver
	BirthInfo(LocalDate dob, Person person){
		dateOfBirth=dob;
		this.person=person;
	}
	//factory
	public static BirthInfo factoryOfBirthInfo(LocalDate dob,String name){
		return new BirthInfo(dob,name);
	}
	
	//getters 
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public Person getPerson() {
		return person;
	}
	
}
