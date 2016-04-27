import java.util.List;
import java.util.ArrayList;

public class LearningRule {

  public boolean stopLearning;

  public NeuralNetwork  neuralNetwork;
  public TrainingSet  trainingSet;

  public void LearningRule() {
      neuralNetwork = null;
      trainingSet = null;
  }

  public void LearningRule(NeuralNetwork network) {
      neuralNetwork = network;
  }

  public void setTrainingSet(TrainingSet trainingSet) {
      trainingSet = trainingSet;
  }

  public TrainingSet getTrainingSet() {
    return trainingSet;
  }

  public NeuralNetwork getNeuralNetwork() {
    return neuralNetwork;
  }

  public void setNeuralNetwork(NeuralNetwork network) {
    neuralNetwork = network;
  }

  public void run() {
  }

  public void stopLearning() {
  }

  public boolean isStopped() {
    return false;
  }

  public void notifyChange() {
  }

  public void learn(TrainingSet trainingSet) {
  }

}