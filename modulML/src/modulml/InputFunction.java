package modulml;

import java.util.List;

public class InputFunction {

    public SummingFunction summingFunction;
    public WeightsFunction weightsFunction;

    public void InputFunction() {
        summingFunction = null;
        weightsFunction = null;
    }

    public void InputFunction(WeightsFunction weightsFunction, SummingFunction summingFunction) {
        this.weightsFunction = weightsFunction;
        this.summingFunction = summingFunction;
    }

    public double getOutput(List<Connection> inputConnections) {
        double output = 0.0;

//        for(int i=0; i<inputConnections.size(); i++) {
//        }
        return output;
    }

    public SummingFunction getSummingFunction() {
        return this.summingFunction;
    }

    public WeightsFunction getWeightsFunction() {
        return this.weightsFunction;
    }

}
