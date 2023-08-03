public class Neptune extends Currency {
  
  public Neptune (double amount) {
    super(amount);
    currencyName = "NeptuneNuggets";
    planetName = "Neptune";
  }

  public double toEarthDollars(double amount) {
    return amount / ED_TO_NN;
  }

  public double fromEarthDollars(double EarthDollars) {
    return EarthDollars * ED_TO_NN;
  }
}
