package modulml;

import java.util.List;


public class InputFunction {

    public SummingFunction  summingFunction;
    public WeightsFunction  weightsFunction;

  public void InputFunction() {
  }

  public void InputFunction(WeightsFunction weightsFunction, SummingFunction summingFunction) {
  }

  public double getOutput(List<Connection> inputConnections) {
  return 0.0;
  }

  public SummingFunction getSummingFunction() {
  return null;
  }

  public WeightsFunction getWeightsFunction() {
  return null;
  }

}