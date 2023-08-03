import java.text.DecimalFormat;

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

  public double addFunds (double x) {
    return this.totalFunds + x;
  }

  public double subtractFunds (double x) {
    return this.totalFunds - x;
  }

  // Constructor
  public Currency (double totalFunds) {
    this.totalFunds = totalFunds;
  }

  // Implement exchange method
  public void exchange(Currency other, double amount) {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    if (this.totalFunds < amount) {
      System.out.println();
      System.out.println("Uh oh - " + this.planetName + " only has an available balance of $" + this.totalFunds + "which is less than $" + amount + "!");
      System.out.println();
    }

    else {
      System.out.println("Converting from " + this.currencyName+ " to " + other + " and initiating transfer...");

      double earthDollars = toEarthDollars(amount);
      double newAmount = fromEarthDollars(earthDollars);

      System.out.println("$" + amount + " " + this.currencyName + " = $" + earthDollars + " = $" + newAmount);

      other.addFunds(newAmount);
      this.subtractFunds(amount);
      
      System.out.println(this.planetName + " has a total of $" + this.getTotalFunds() + " " + this.currencyName);
      System.out.println(other.planetName + " has a total of $" + other.getTotalFunds() + " " + other.currencyName);
      System.out.println();
    }
  }

  // Abstract methods
  public abstract double toEarthDollars(double amount);
  public abstract double fromEarthDollars(double EarthDollars);
  
}