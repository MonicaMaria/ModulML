package modulml;

import java.util.List;
import java.util.ArrayList;

public class TrainingSet {

  public String label;

  public String filePath;

    /**
   * 
   * @element-type TrainingElement
   */
  public List<TrainingElement>  elements;
  
  public void TrainingSet() {
      elements = new ArrayList<>();
  }

  public void addElement(TrainingElement el) {
      elements.add(el);
  }

  public void removeElementAt(int index) {
      elements.remove(index);
  }

  public List<TrainingElement> getTrainingElements() {
      return elements;
  }

  public TrainingElement trainingElementsAt(int index) {
      return elements.get(index);
  }

  public void clear() {
      elements.clear();
  }

  public boolean isEmpty() {
      return elements.isEmpty();
  }

  public String getLabel() {
      return this.label;
  }

  public void setLabel(String label) {
      this.label = label;
  }

  public void setFilePath(String path) {
      this.filePath = path;
  }

  public String getFilePath() {
      return this.filePath;
  }

  public void save() {
      
  }

  public void save(String filePath) {
      
  }

}