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
    DecimalFormat f = new DecimalFormat("#0.00");

    if (this.totalFunds < amount) {
      System.out.println();
      System.out.println("Uh oh - " + this.planetName + " only has an available balance of $" + f.format(this.totalFunds) + " which is less than $" + f.format(amount) + "!");
      System.out.println();
    }

    else {
      System.out.println("Converting from " + this.currencyName+ " to " + other.currencyName + " and initiating transfer...");

      double earthDollars = this.toEarthDollars(amount);
      double newAmount = other.fromEarthDollars(earthDollars);

      System.out.println("$" + f.format(amount) + " " + this.currencyName + " = $" + f.format(earthDollars) + " EarthDollars " + " = $" + f.format(newAmount) + " " + other.currencyName);

      other.setTotalFunds(other.addFunds(newAmount));
      this.setTotalFunds(this.subtractFunds(amount));

      System.out.println(this.planetName + " has a total of $" + f.format(this.getTotalFunds()) + " " + this.currencyName);
      System.out.println(other.planetName + " has a total of $" + f.format(other.getTotalFunds()) + " " + other.currencyName);
      System.out.println();
    }
  }

  // Abstract methods
  public abstract double toEarthDollars(double amount);
  public abstract double fromEarthDollars(double EarthDollars);
  
}