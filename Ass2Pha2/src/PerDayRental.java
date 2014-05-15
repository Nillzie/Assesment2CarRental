
public class PerDayRental {


public int rentID;
public int rentLength;
public int carSel;
public double rentCost;


public PerDayRental()
{
rentID = 0;
rentLength = 1;
carSel = 0;
rentCost = 0.0;
}

public PerDayRental(int id, int l, int s, double c)
{
rentID = id;
rentLength = l;
carSel = s;
rentCost = c;
}

public int getLength()
{
return rentLength;
}

public int getID()
{
return rentID;
}

public int getCarSel()
{
return carSel;
}

public double getRentCost()
{
return rentCost;
}
}