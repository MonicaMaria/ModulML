import java.util.Vector;

public class Neuron {

  public double netInput;

  public double output;

  public double error;

    /**
   * 
   * @element-type Connection
   */
  public Vector  inputConnections;
    /**
   * 
   * @element-type Connection
   */
  public Vector  outConnections;
    public Vector  myConnection;
    public Vector  myConnection;
    public Vector  parentLayer;
    public Vector  myLayer;
    public Vector  transferFunction;
    public Vector  inputFunction;
    public Vector  outputNeurons;
    public Vector  inputNeurons;

  public void Neuron() {
  }

  public void Neuron( inputFunction,  transferFunction) {
  }

  public void calculate() {
  }

  public void reset() {
  }

  public void setInput(double input) {
  }

  public double getNetInput() {
  return 0.0;
  }

  public double getOutput() {
  return 0.0;
  }

  public boolean hasInputConnection() {
  return false;
  }

  public Iterator<Connection> getInputsIterator() {
  return null;
  }

  public void addInputConnection(Connection connection) {
  }

  public void addInputConnection(Neuron fromNeuron, double weight) {
  }

  public void addOutputConnection(Connection connection) {
  }

  public List<Connection> getInputConnections() {
  return null;
  }

  public List<Connection> getOutConnections() {
  return null;
  }

  public void removeInputConnection(Neuron fromNeuron) {
  }

  public Connection getConnectionFrom(Neuron fromNeuron) {
  return null;
  }

  public void setInputFunction(InputFunction function) {
  }

  public void setTransferFunction(TransferFunction function) {
  }

  public InputFunction getInputFunction() {
  return null;
  }

  public TransferFunction getTransferFunction() {
  return null;
  }

  public void setParentLayer(Layer layer) {
  }

  public Layer getParentLayer() {
  return null;
  }

  public List<Weight> getWeights() {
  return null;
  }

  public double getError() {
  return 0.0;
  }

  public void setError(double error) {
  }

  public void setOutput(double output) {
  }

  public void randomizeInputWeights() {
  }

}