package modulml;

import java.util.List;

public class SummingFunction {

    public double getOutput(List<Double> inputVector) {

        double output = 0.0;

        for (int i = 0; i < inputVector.size(); i++) 
            output = output + inputVector.get(i);
        
        return output;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }

}
