package modulml;



public class TransferFunction {

  protected double output;
   
  public double getOutput(double net) {
    return this.output;
  }

  public double getDerivative(double net) {
    return 0.0;
  }

  @Override
  public String toString() {
    return getClass().getName();
  }

    
}