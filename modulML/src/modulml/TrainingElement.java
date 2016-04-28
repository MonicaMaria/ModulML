package modulml;

import java.util.List;
import java.util.ArrayList;

public class TrainingElement {

    /**
     *
     */
  public List<Double> input;

  public String label;

  
  public void TrainingElement() {
      input = new ArrayList<>();
  }

  public List<Double> getInput() {
      return input;
  }

  public void setInput( List<Double> in) {
      input = in;
  }

  public String getLabel() {
      return label;
  }

  public void setLabel(String lbl) {
      label = lbl;
  }

}