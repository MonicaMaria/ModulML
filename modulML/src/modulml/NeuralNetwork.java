import java.util.Vector;

public class NeuralNetwork {

    /**
   * 
   * @element-type Neuron
   */
  public Vector  myNeuron;
    /**
   * 
   * @element-type Neuron
   */
  public Vector  myNeuron;
    /**
   * 
   * @element-type Layer
   */
  public Vector  layers;
    public Vector  myLayer;
    public Vector  myLearningRule;
    public Vector  myLearningRule;

  public void NeuralNetwork() {
  }

  public void addLayer(Layer layer) {
  }

  public void addLayer(int idx, Layer layer) {
  }

  public void removeLayer(Layer layer) {
  }

  public void removeLayer(int idx) {
  }

  public Iterator<Layer> getLayersIterator() {
  return null;
  }

  public List<Layer> getLayers() {
  return null;
  }

  public void setInput(List<double> inputVector) {
  }

  public void setInput() {
  }

  public List<double> getOutput() {
  return null;
  }

  public void calculate() {
  }

  public void reset() {
  }

  public void run() {
  }

  public void learn(TrainingSet trainingSetToLearn) {
  }

  public void learn(TrainingSet trainingSetToLearn, LearningRule learningRule) {
  }

  public void stopLearning() {
  }

  public void randomizeWeights() {
  }

  public List<Neuron> getInputNeurons() {
  return null;
  }

  public void setInputNeurons(List<Neuron> inputNeurons) {
  }

  public List<Neuron> getOutputNeurons() {
  return null;
  }

  public void setOutputNeurons(List<Neuron> outputNeurons) {
  }

  public LearningRule getLearningRule() {
  return null;
  }

  public void setLearningRule(LearningRule learningRule) {
  }

  public void notifyChange() {
  }

  public void createConnection(Neuron fromNeuron, Neuron toNeuron, double weightVal) {
  }

  public String toString() {
  return null;
  }

}