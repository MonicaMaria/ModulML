package modulml;

import java.util.ArrayList;
import java.util.List;

public class Neuron {

    private double netInput;
    private double output;
    private double error;

    private List<Connection> inputConnections;
    private List<Connection> outConnections;

    private Layer parentLayer;
    private TransferFunction transferFunction;
    private InputFunction inputFunction;

    public void Neuron() {
        inputConnections = new ArrayList<>();
        outConnections = new ArrayList<>();
    }

    public void Neuron(InputFunction inputFunction, TransferFunction transferFunction) {
        this.inputFunction = inputFunction;
        this.transferFunction = transferFunction;
        inputConnections = new ArrayList<>();
        outConnections = new ArrayList<>();
    }

    public void calculate() {
        output = inputFunction.getOutput(inputConnections);
    }

    public void reset() {
        randomizeInputWeights();
    }

    public void setInput(double input) {
        this.netInput=input;
    }

    public double getNetInput() {
        return netInput;
    }

    public double getOutput() {
        return output;
    }

    public boolean hasInputConnection() {
        return inputConnections.size() > 0;
    }

    public void addInputConnection(Connection connection) {
        inputConnections.add(connection);
    }

    public void addOutputConnection(Connection connection) {
        outConnections.add(connection);
    }

    public List<Connection> getInputConnections() {
        return inputConnections;
    }

    public List<Connection> getOutConnections() {
        return outConnections;
    }

    public void removeInputConnection(Neuron fromNeuron) {
        for (int i = 0 ; i < inputConnections.size(); i++)
            if(inputConnections.get(i).connectedNeuron==fromNeuron)
                inputConnections.remove(i);
    }

    public Connection getConnectionFrom(Neuron fromNeuron) {
        for (int i = 0 ; i < inputConnections.size(); i++)
            if(inputConnections.get(i).connectedNeuron==fromNeuron)
                return inputConnections.get(i);
        return null;
    }

    public void setInputFunction(InputFunction function) {
        this.inputFunction=function;
    }

    public void setTransferFunction(TransferFunction function) {
        this.transferFunction=function;
    }

    public InputFunction getInputFunction() {
        return this.inputFunction;
    }

    public TransferFunction getTransferFunction() {
        return this.transferFunction;
    }

    public void setParentLayer(Layer layer) {
        this.parentLayer=layer;
    }

    public Layer getParentLayer() {
        return parentLayer;
    }

    public List<Weight> getWeights() {
        List<Weight> wgt = new ArrayList<>();
        for(int i = 0; i < inputConnections.size(); i++)
            wgt.add(inputConnections.get(i).weight);
    }

    public double getError() {
        return error;
    }

    public void setError(double error) {
        this.error=error;
    }

    public void setOutput(double output) {
        this.output=output;
    }

    public void randomizeInputWeights() {
        for (int i=0; i< inputConnections.size(); i++)
            inputConnections.get(i).weight.value = Math.random();
    }

}
