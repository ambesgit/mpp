package lab9;

import java.util.Comparator;

public class ProblemTwo {

	public static void main(String[] args) {
		
	}

}
//--------------------------------------------Problem 2----------------------
//rewritting the compare method for the problem two of A
class EmployeeInfo{
	String name;
	double salary;
	//-------------------------part A-------------------------
	Comparator<EmployeeInfo> compareByName= new Comparator(){
		@Override
	public int compare(Object e1, Object e2) {
			if(((EmployeeInfo)e1).name.equals(((EmployeeInfo)e2).name) && ((EmployeeInfo)e1).equals(((EmployeeInfo)e2))){
				return 0;
				
			}
			else{
				return ((EmployeeInfo)e1).name.compareTo(((EmployeeInfo)e2).name);
			}
	
	}
	};
	//----------------------------------part B----------------------------
	Comparator<EmployeeInfo> compareBySalary= new Comparator(){
		@Override
	public int compare(Object e1, Object e2) {
			if(((EmployeeInfo)e1).salary==((EmployeeInfo)e2).salary && ((EmployeeInfo)e1).equals(((EmployeeInfo)e2))){
				return 0;
				
			}
			else if(((EmployeeInfo)e1).salary<((EmployeeInfo)e2).salary){
				return -1;
			}
			else{
				return 1;
			}
	
	}
	};	
}
//-------------------------------part C-----------------------------------

