public class Sine extends Taylor{
    public Sine (int k, double x) {
        super(k,x);
    }
    public void printValue() {
        System.out.println("Value from Math.sin() is " + Math.sin(getValue()) + ".");
        System.out.println("Approximated value is " + getApprox() + ".");
    }
    public double getApprox() {
        double sin = 0;
        for (int i = 0; i <= getIteration(); i++) {
            sin += (Math.pow(-1, i))*(Math.pow(getValue(), 2*i+1))/factorial(2*i+1);
        }
        return sin;
    }
}
