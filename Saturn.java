public class Saturn extends Currency {

  public Saturn (double amount) {
    super(amount);
    currencyName = "SaturnSilver";
    planetName = "Saturn";
  }
  
  public double toEarthDollars(double amount) {
    return amount / ED_TO_SS;
  }

  public double fromEarthDollars(double EarthDollars) {
    return EarthDollars * ED_TO_SS;
  }
}
