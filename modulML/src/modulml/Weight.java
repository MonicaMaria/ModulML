package modulml;
import java.util.Vector;

public class Weight {

  public double value;

  public double previousValue;

    public Vector  myConnection;

  public void Weight() {
  }

  public void Weight(double value) {
  }

  public void inc(double amount) {
    return amount++;
  }

  public void dec(double amount) {
    return amount--;
  }

  public void setValue(double value) {
    this.value=value;
  }

  public double getValue() {
  return value;
  }

  public void setPreviousValue(double previousValue) {
    this.previousValue=previousValue;
  }

  public double getPreviousValue() {

    return previousValue;
  }

  public String toString() {
  return null;
  }

  public void randomize() {
  }

}