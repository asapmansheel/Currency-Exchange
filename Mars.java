public class Mars extends Currency implements Exchangeable {

  public Mars (double amount) {
    super(amount);
    currencyName = "MarsMoney";
    planetName = "Mars";
  }

  public double toEarthDollars(double amount) {
    return amount / ED_TO_MM;
  }

  public double fromEarthDollars(double EarthDollars) {
    return EarthDollars * ED_TO_MM;
  }

  
}
