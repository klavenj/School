
import java.util.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner input = new Scanner(System.in);
		
		Employee one = new Employee();
		Employee two = new Employee();
		
		
		double salaryOne, salaryTwo;
		String employeeOne, employeeTwo;
		
		one.setFirstName("Bob");
		one.setLastName("Jones");
		one.setSalary(34500.00);
		
		employeeOne = one.getFirstName() +" "+ one.getLastName();
		salaryOne = one.getSalary();
		
		two.setFirstName("Susan");
		two.setLastName("Baker");
		two.setSalary(37809.00);
		
		employeeTwo = two.getFirstName() +" "+ two.getLastName();
		salaryTwo = two.getSalary();
		
		
		
		System.out.println("Employee 1: " + employeeOne + ";" + " Yearly Salary: " + salaryOne);
		System.out.println("Employee 2: " +employeeTwo + ";" + " Yearly Salary: " + salaryTwo);
		
		System.out.println();
		
		System.out.println("Increasing employee salaries by 10%");
		
		salaryOne = (salaryOne * .1) + salaryOne;
		salaryTwo = (salaryTwo * .1) + salaryTwo;
		
		System.out.println();
		
		System.out.println("Employee 1: " +employeeOne + ";" + " Yearly Salary: " + salaryOne);
		System.out.println("Employee 2: " +employeeTwo + ";" + " Yearly Salary: " + salaryTwo);
		
		
	
	}

}
