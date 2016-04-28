/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulml;

/**
 *
 * @author Georgiana
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Layer {

  private List<Neuron> neurons;
  private NeuralNetwork  parentNetwork;

  public void Layer() {
      neurons = new ArrayList<>();            
  }

  public void setParentNetwork(NeuralNetwork parent) {
      this.parentNetwork=parent;
  }

  public NeuralNetwork getParentNetwork() {
      return this.parentNetwork;
  }

  public Iterator<Neuron> getNeuronsIterator() {
      return this.neurons.iterator();
  }

  public void addNeuron(Neuron neuron) {
      neurons.add(neuron);
  }

  public void addNeuron(int idx, Neuron neuron) {
      neuron.setParentLayer(this);
      this.neurons.add(idx, neuron);
  }

  public void setNeuron(int idx, Neuron neuron) {
      neuron.setParentLayer(this);
      this.neurons.set(idx, neuron);
  }

  public void removeNeuron(Neuron neuron) {
      this.neurons.remove(neuron);
  }

  public void removeNeuronAt(int idx) {
      this.neurons.remove(idx);
  }

  public Neuron getNeuronAt(int idx) {
      return this.neurons.get(idx);
  }

  public int indexOf(Neuron neuron) {
      return this.neurons.indexOf(neuron);
  }

  public int getNeuronsCount() {
      return this.neurons.size();
  }

  public void calculate() {
      for(Neuron neuron : this.neurons) {
	neuron.calculate();
      }
  }

  public void reset() {
      for(Neuron neuron : this.neurons) {
	neuron.reset();
      }
  }

  public void randomizeWeights() {
      for(Neuron neuron : this.neurons) { 
        neuron.randomizeInputWeights();
      }  
  }

}
