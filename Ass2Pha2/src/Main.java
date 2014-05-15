import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int c = 0;
		int[] rentsArray = new int[c];
		
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub
		//Sean M, Added Variables
		int carSelNum = 0;
		int rentSelNum = 0;
		double rentPrice = 0;
		int rentLength = 0;
		String carType = "";
		
		//Vehicle v = new Vehicle("Ford", "T812", 2014);

		//v.printDetails();
		
		//loading cars into constructor SM
		Cars hyandi1= new Cars(100 ,0, 1, 1, 99.15);
		Cars ford1 = new Cars (1000, 1, 2, 0, 110.55);
		Cars honda1 = new Cars (2000, 0, 3, 1, 78.49);
		
		// Vehicle sample distance
	//	for (int i = 0; i < 10; i++) {
		//	v.addKilometers(new Random().nextInt(100));
		//}
		
		// Loading Selection Messages SM
		System.out.println("Welcome to Car rental kiosk");
		System.out.println("Select a rental type");
		System.out.println("Enter 1 for Rental Per Day");
		System.out.println("Enter 2 for Rental per Km");
		
		//User Selects input type SM
		rentSelNum = input.nextInt();
		
		//Selection Comments SM
			if (rentSelNum == 1) 
			{	//Price Per Day Rental Option
				System.out.println("You have Selected Rental Per Day");
			}
			else if (rentSelNum == 2)
			{	//Price Per KM option
				System.out.println("You have Sekected Rental Per Km");
			}
			else
			{	//Bad Selection comment
				System.out.println("Incorrect Selection, Please Enter 1 or 2");
				rentSelNum = input.nextInt();
			}
			
			//Car Selection Options SM
			System.out.println("Please Select Your Car");
			System.out.println("Select 1 for a Hyandai i30");
			System.out.println("Select 2 for a Ford Laser");
			System.out.println("Select 3 for a Honda Jazz");
			//Saving Car Selection SM
			carSelNum = input.nextInt();
			
			if((carSelNum >= 1) && (carSelNum >= 3) && (rentSelNum == 1)) {
				switch (rentSelNum) {
				case 1:
				rentPrice = hyandi1.getPrice();
				carType = "Hyandai i30";
				break;

				case 2:
				rentPrice = ford1.getPrice();
				carType = "Ford Laser";
				break;

				case 3:
				rentPrice = ford1.getPrice();
				carType = "Hyandi Jazz";
				break;}}
				else {System.out.println("Invalid Selection");}

			System.out.println("You Have Selected a " + carType + " at $" + rentPrice);
			System.out.println("Enter how Many Days you would like the car for");
			//getting length of the rental SM
			rentLength = input.nextInt();
			// making new rental object SM
			PerDayRental rental = new PerDayRental(c,rentLength,carSelNum,(rentPrice * rentLength));

			System.out.println("Your Price will be $" + rental.getRentCost());
			System.out.println(rental.getLength());
		
			//
			//  !!!ENTER OTHER CODE HERE FOR SERVICE AND RENTPERKM!!!
			//
			
		//System.out.println("\n\n");
		
	//	v.printDetails();
	//	System.out.println("Vehicle main Class");
	}

}
