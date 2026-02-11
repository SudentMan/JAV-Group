public class Expo extends Taylor {
    public Expo(int k, double x) {
        super(k,x);
    }
    public void printValue() {
        System.out.println("Value from Math.exp() is " + Math.exp(getValue()) + ".");
        System.out.println("Approximated value is " + getApprox() + ".");
    }
    public double getApprox() {
        double exp = 0;
        for (int i = 0; i <= getIteration(); i++) {
            exp += Math.pow(getValue(), i)/factorial(i);
        }
        return exp;
    }

}
