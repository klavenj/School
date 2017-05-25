
public class DemoCabinRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CabinRental one = new CabinRental(2);	
		CabinRental two = new CabinRental(4);
		HolidayCabinRental three = new HolidayCabinRental(2);
		HolidayCabinRental four = new HolidayCabinRental(4);
		
		System.out.printf("Low Cabin #2 rate: $%.02f  \n" , one.getRate());
		System.out.printf("High Cabin #4 rate: $%.02f  \n", two.getRate());
		System.out.printf("Low Cabin #2 rate: $%.02f  \n", three.getHolidayRate());
		System.out.printf("High Cabin #4 rate: $%.02f \n", four.getHolidayRate());
	}

}
