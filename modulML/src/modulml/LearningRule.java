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
          // iau greutatile din fisier, sau le fac random
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
  
  public List<Double> getError( List<Double> output, List<Double> desiredOutput ) {
      List<Double> err = new ArrayList<>();
      
      for( int i = 0; i < desiredOutput.size(); i++ ) {
          Double el;
          el = desiredOutput.get(i) - output.get(i);
          err.add(el);
      }
      return err;
  } 

}