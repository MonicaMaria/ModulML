import java.util.Vector;

public class LearningRule {

  public boolean stopLearning;

    public Vector  learningRule;
    public Vector  neuralNetwork;
    public Vector  trainingSet;

  public void LearningRule() {
  }

  public void LearningRule(NeuralNetwork network) {
  }

  public void setTrainingSet(TrainingSet trainingSet) {
  }

  public TrainingSet getTrainingSet() {
  return null;
  }

  public NeuralNetwork getNeuralNetwork() {
  return null;
  }

  public void setNeuralNetwork(NeuralNetwork neuralNetwork) {
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