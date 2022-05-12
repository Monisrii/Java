package week1.day4;

public class EmployeeDetails {

	
public void printEmployeeName(String empName,int empId)
{
	System.out.println("empName,empId-"+empName+","+empId);
}
public void printEmployeeAddress(String empAddress)
{
	System.out.println("empAddress-"+empAddress);
}
public void printEmployeeSalary(double empSalary)
{
	System.out.println("empSalary-"+empSalary);
	
}
public void printEmployeeMobileNo(long empMobile)

{
	System.out.println("empMobile-"+empMobile);
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	EmployeeDetails obj=new EmployeeDetails();
	obj.printEmployeeName("Monika",22);
	obj.printEmployeeAddress("Msk");
	obj.printEmployeeSalary(19000.0);
	obj.printEmployeeMobileNo(866756633);
	}



}
