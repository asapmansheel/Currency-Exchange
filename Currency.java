public abstract class Currency implements Exchangeable {
  String currencyName;
  String planetName;
  double totalFunds;

  // Getters and setters
  public String getCurrencyName() {
    return currencyName;
  }
  public void setCurrencyName(String currencyName) {
    this.currencyName = currencyName;
  }
  public String getPlanetName() {
    return planetName;
  }
  public void setPlanetName(String planetName) {
    this.planetName = planetName;
  }
  public double getTotalFunds() {
    return totalFunds;
  }
  public void setTotalFunds(double totalFunds) {
    this.totalFunds = totalFunds;
  }

  // Constructor
  public Currency (double totalFunds) {
    this.totalFunds = totalFunds;
  }

  // Implement exchange method
  public void exchange(Currency other, double amount) {

  }

  // Abstract methods
  public abstract double toEarthDollars(double amount);
  public abstract double fromEarthDollars(double EarthDollars);
  
}