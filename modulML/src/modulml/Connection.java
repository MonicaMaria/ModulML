package modulml;

public class Connection {
    public Neuron  connectedNeuron;
    public Weight weight;

  public Connection(Neuron connectTo) {
      this.connectedNeuron = connectTo;
  }

  public Connection(Neuron connectTo, Weight weight) {
      this.connectedNeuron = connectTo;
      this.weight = weight;
  }

  public Connection(Neuron from, Neuron connectTo) {
      this.connectedNeuron = connectTo;
      from.addOutputConnection(this);
  }

  public Weight getWeight() {
      return weight;
  }

  public Neuron getConnectedNeuron() {
      return connectedNeuron;
  }

}