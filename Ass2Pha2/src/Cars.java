
public class Cars {

/**
* @param args
*/
//Car Stats SM
	private int odoKm;
	private int numOfServ;
	private int carId;
	private int carAva;
	private double pricePerDay;
//Default Values SM
	public Cars()
	{
		carId = 999;
		odoKm = 0;
		numOfServ = 0;
		carAva = 1;
		pricePerDay = 100.0;
	}

	public Cars(int o, int s, int i, int a, double p)
	{
		odoKm = o;
		numOfServ  = s;
		carId = i;
		carAva = a;
		pricePerDay = p;
	}	

//Returns Number of Services SM
	public int getServiceCount()
	{
		return numOfServ;
	}
//Returns the odometer SM
	public int getOdoCount()
	{
		return odoKm;
	}
//return car id SM
	public int getCarId()
	{
		return carId;
	}
//Return Car Availability SM
	public int getAva()
	{
		return carAva;
	}
//ReturnPricePerDay SM
	public double getPrice()
	{
		return pricePerDay;
	}
}

