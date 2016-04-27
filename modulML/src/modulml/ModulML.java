/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulml;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Monica
 */
public class ModulML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NeuralNetwork retea = new NeuralNetwork();
        List<Double> input = new ArrayList<>();
        for(int i=0;i<30;i++) input.add(0.0);
        input.set(1, 1.0);
        input.set(9, 1.0);
        List<Neuron> inputNeurons = new ArrayList<>();
        inputNeurons.add(new Neuron());
        inputNeurons.add(new Neuron());
        inputNeurons.add(new Neuron());
        retea.setInputNeurons(inputNeurons);
        retea.setInput(input);
        Layer hid = new Layer();
        retea.addLayer(hid);
        hid.addNeuron(new Neuron());
        hid.addNeuron(new Neuron());
        
        retea.run();
    }
    
}
