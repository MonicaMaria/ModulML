package modulml;

public class TransferFunction {

    protected double output;
    private double slope = 1d;

    public double getOutput(double net) {
        return output;
        
    }

    public double activate(double net) {
        if (net > 100) {
            return 1.0;
        } else if (net < -100) {
            return 0.0;
        }

        double den;
        den = 1d + Math.exp(-this.slope * net);
        this.output = (1d / den);

        return this.output;
    }

    public double getDerivative(double net) {
        return 0.0;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }

}
