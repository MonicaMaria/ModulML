package modulml;
<<<<<<< HEAD
=======

import java.util.ArrayList;
import java.util.List;
>>>>>>> origin/master

import java.util.List;

<<<<<<< HEAD
public class WeightsFunction {

  public List<Double> getOutput(List<Connection> inputs) {
  return null;
  }
=======
    public List<Double> getOutput(List<Connection> inputs) {

        List<Double> outputList = new ArrayList<>();

//      for(int i=0;i<inputs.size();i++)
//          outputList.add(inputs.);
        return outputList;
    }
>>>>>>> origin/master

    @Override
    public String toString() {
        return getClass().getName();
    }

}
