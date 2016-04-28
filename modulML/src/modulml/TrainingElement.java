package modulml;

import java.util.List;
import java.util.ArrayList;

public class TrainingElement {

    /**
     *
     */
  public List<Double> input;
  public List<Double> desiredOutput;

  public String label;

  
  public void TrainingElement() {
      input = new ArrayList<>();
  }

  public List<Double> getInput() {
      return input;
  }
  
  public List<Double> getDesiredOutput() {
      return desiredOutput;
  }

  public void setInput( List<Double> in) {
      input = in;
  }
  
  public void setDesiredInput(List<Double> output) {
      desiredOutput = output;
  }

  public String getLabel() {
      return label;
  }

  public void setLabel(String lbl) {
      label = lbl;
  }

}