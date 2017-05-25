
public class HolidayCabinRental extends CabinRental
{
	private double holidayRate;	
	
	public HolidayCabinRental(int num){
		super(num);
		holidayRate = super.getRate() + 150.00;
	}
	
	public double getHolidayRate(){
		return holidayRate;
	}
}
