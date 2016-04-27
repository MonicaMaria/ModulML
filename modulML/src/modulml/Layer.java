import java.util.Vector;

public class Layer {

    public Vector  myNeuron;
    /**
   * 
   * @element-type Neuron
   */
  public Vector  neurons;
    public Vector  myNeuralNetwork;
    public Vector  parentNetwork;

  public void Layer() {
  }

  public void setParentNetwork(NeuralNetwork parent) {
  }

  public NeuralNetwork getParentNetwork() {
  return null;
  }

  public Iterator<Neuron> getNeuronsIterator() {
  return null;
  }

  public void addNeuron(Neuron neuron) {
  }

  public void addNeuron(int idx, Neuron neuron) {
  }

  public void setNeuron(int idx, Neuron neuron) {
  }

  public void removeNeuron(Neuron neuron) {
  }

  public void removeNeuronAt(int idx) {
  }

  public Neuron getNeuronAt(int idx) {
  return null;
  }

  public int indexOf(Neuron neuron) {
  return 0;
  }

  public int getNeuronsCount() {
  return 0;
  }

  public void calculate() {
  }

  public void reset() {
  }

  public void randomizeWeights() {
  }

}