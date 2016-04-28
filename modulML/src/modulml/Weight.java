package modulml;

public class Weight {

  private double value;

  public Weight() {
      value=0;
  }

  public Weight(double value) {
      this.value = value;
  }

  public void inc(double amount) {
    amount++;
  }

  public void dec(double amount) {
    amount--;
  }

  public void setValue(double value) {
    this.value=value;
  }

  public double getValue() {
  return value;
  }

  public String toString() {
  return null;
  }

  public void randomize() {
      this.value = Math.random();
  }

}