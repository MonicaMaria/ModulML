package modulml;

public class TransferFunction {

  protected double output;
   
  public double getOutput(double net) {
      return output;
  }
  
  public double activate(double net) {
    if (net>0.5)
        return 1.0;
    else return 0.0;
  }

  public double getDerivative(double net) {
    return 0.0;
  }

  @Override
  public String toString() {
    return getClass().getName();
  }

    
}