
public class Employee {
	
	private String mFirstName, mLastName;
	private double mSalary;
	
	
	//Constructors
	//Default
	public Employee(){
		mFirstName = null;
		mLastName = null;
		mSalary = 0;
	}
	
	public Employee(String firstName, String lastName, double salary){
		mFirstName = firstName;
		mLastName = lastName;
		mSalary = salary;
	}
	
	//Setters and Getters
	public void setFirstName(String firstName){
		mFirstName = firstName;
	}
	
	public void setLastName(String lastName){
		mLastName = lastName;
	}
	
	public void setSalary(double salary){
		if(salary >= 0){
			mSalary = salary;
		}
	}
	
	public String getFirstName(){
		return mFirstName;
	}
	
	public String getLastName(){
		return mLastName;
	}
	
	public double getSalary(){
		return mSalary;
	}
}
