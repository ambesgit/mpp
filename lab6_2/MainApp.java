package lab6_2;

import java.time.LocalDate;

public class MainApp {

	public static void main(String[] args) {
		Person p=new Person("ambes",LocalDate.now());
		System.out.println("------From the Person object-----");
		System.out.println(p.getBirthInfo().getDateOfBirth());
		System.out.println(p.getName());
		
		BirthInfo b=new BirthInfo(LocalDate.now(),"ambes");
		System.out.println("------From the BirthInfo object-----");
		System.out.println(b.getPerson().getName());
		System.out.println(b.getDateOfBirth());
		//-----------Person factory method
		Person fp=Person.factoryOfPerson("tetemke",LocalDate.now());
		System.out.println("------Using factoryOfPerson-----");
		System.out.println(fp.getBirthInfo().getDateOfBirth());
		System.out.println(fp.getName());
		//--------------BirthInfo factory method----------
		BirthInfo fb=BirthInfo.factoryOfBirthInfo(LocalDate.now(),"tetemke");
		System.out.println("------Using factory of BirthInof -----");
		System.out.println(fb.getDateOfBirth());
		System.out.println(fb.getPerson().getName());

	}

}
