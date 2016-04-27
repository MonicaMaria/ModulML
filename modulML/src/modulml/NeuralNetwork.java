import java.util.ArrayList;
import java.util.List;

public class NeuralNetwork {

  private List<Neuron>  outputNeurons;

  private List<Neuron>  inputNeurons;

  private List<Layer>  layers;
  private LearningRule  learningRule;

  public void NeuralNetwork() {
    outputNeurons = new ArrayList<>();
    inputNeurons = new ArrayList<>();
    layers = new ArrayList<>();
  }

  public void addLayer(Layer layer) {
    layer.setParentNetwork(this);
    layers.add(layer);
  }

  public void addLayer(int idx, Layer layer) {
    layer.setParentNetwork(this);
    layers.add(idx,layer);
  }

  public void removeLayer(Layer layer) {
    final boolean rmv;
    rmv = layers.remove(layer);
  }

  public void removeLayer(int idx) {
    Layer layer = layers.remove(idx);
  }

  public List<Layer> getLayers() {
    return layers;
  }

  public void setInput(List<Double> inputVector) {
    for(int i=0;i<inputVector.size();i++)
      inputNeurons.get(i).setInput(inputVector.get(i));
  }

    /*public void setInput() {

    }*/

  public List<Double> getOutput() {
    List<Double> outputList = new ArrayList<>();
    for(int i=0;i<outputNeurons.size();i++)
      outputList.add(outputNeurons.get(i).getOutput());
    return outputList;
  }

  public void calculate() {
    for(int i=0;i<layers.size();i++)
      layers.get(i).calculate();
  }

  public void reset() {
    for(int i=0;i<layers.size();i++)
      layers.get(i).reset();
  }

  public void run() {

  }

  public void learn(TrainingSet trainingSetToLearn) {
    learningRule.setNeuralNetwork(this);
    learningRule.learn(trainingSetToLearn);
  }

  public void learn(TrainingSet trainingSetToLearn, LearningRule learningRule) {
    learningRule.setNeuralNetwork(this);
    learningRule.learn(trainingSetToLearn);
  }

  public void stopLearning() {
    learningRule.stopLearning();
  }

  public void randomizeWeights() {
    for(int i=0;i<layers.size();i++)
      layers.get(i).randomizeWeights();
  }

  public List<Neuron> getInputNeurons() {
    return inputNeurons;
  }

  public void setInputNeurons(List<Neuron> inputNeuronsList) {
    for(int i=0;i<inputNeuronsList.size();i++)
      inputNeurons.add(inputNeuronsList.get(i));
  }

  public List<Neuron> getOutputNeurons() {
    return outputNeurons;
  }

  public void setOutputNeurons(List<Neuron> outputNeuronsList) {
    for(int i=0;i<outputNeuronsList.size();i++)
      outputNeurons.add(outputNeuronsList.get(i));
  }

  public LearningRule getLearningRule() {
    return learningRule;
  }

  public void setLearningRule(LearningRule learningRuleToSet) {
    learningRule = learningRuleToSet;
  }

  public void notifyChange() {
    learningRule.notifyChange();
  }

  public void createConnection(Neuron fromNeuron, Neuron toNeuron, double weightVal) {
    Connection connection = new Connection(fromNeuron, toNeuron);
    connection.getWeight().setValue(weightVal);
  }

    /*public String toString() {
        return null;
    }*/

}