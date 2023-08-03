# Interplanetary Currency Converter

Last month, scientists at NASA discovered life on Mars, Neptune, and Saturn! Your job is to create a program that can convert currencies between the planets to aid in interplanetary transactions.

## Implementation Details

You will create 3 currency classes: `Mars.java`, `Neptune.java`, and `Saturn.java`. Each of these classes must derive from an abstract parent class `Currency.java` and implement the interface `Exchangeable.java`.

### Currency.java

The currency class must contain the following data members:
- Name of the currency (`String currencyName`)
  - MarsMoney
  - NeptuneNuggets
  - SaturnSilver
- Total funds (`double totalFunds`)

Additionally, because the planets only trust Earth, dollars will serve as the intermediary currency.

The `Currency` class will contain the following 2 abstract methods:
```java
public abstract double toEarthDollars(double amount);
public abstract double fromEarthDollars(double EarthDollars);
