
public class CabinRental {

	private int cabinNum;
	private double WeeklyCabinRate;
	
	
	//Constructor
	public CabinRental(int num){
		
		cabinNum = num;
		if(num <= 3){
			WeeklyCabinRate = 950.00;
		}
		else{
			WeeklyCabinRate = 1100.00;
		}
		
		
	}
	
	
	public int getCabinNum(){
		return cabinNum;
	}
	
	public double getRate(){
		return WeeklyCabinRate;
	}
}	
