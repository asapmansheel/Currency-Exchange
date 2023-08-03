public interface Exchangeable {
  final double ED_TO_MM = 1.3;
  final double ED_TO_SS = 0.87;
  final double ED_TO_NN = 2;
  
  public void exchange(Currency other, double amount);
}
