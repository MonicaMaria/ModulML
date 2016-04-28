package modulml;

import java.util.List;
import java.util.ArrayList;

public class LearningRule {

  public boolean stopLearning;

  public NeuralNetwork  neuralNetwork;
  public TrainingSet  trainingSet;

  public void LearningRule() {
      neuralNetwork = null;
      trainingSet = null;
      stopLearning = false;
  }

  public void LearningRule(NeuralNetwork network) {
      neuralNetwork = network;
      trainingSet = null;
      stopLearning = false;
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
      
      if( isStopped() == false ) {
          trainingSet = new TrainingSet();
          learn(trainingSet);
      }
  }

  public void stopLearning() {
      stopLearning = true;
  }

  public boolean isStopped() {
      return stopLearning;
  }

  public void notifyChange() {
      
      if( isStopped() == false ) {
          
      }
      
  }

  public void learn(TrainingSet trainingSet) {
      
      //algoritm genetic
      
  }

}