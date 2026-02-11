public class Cosine extends Taylor{
    public Cosine (int k, double x) {
        super(k,x);
    }
    public void printValue () {
        System.out.println("Value from Math.cos() is " + Math.cos(getValue()) + ".");
        System.out.println("Approximated value is " + getApprox() + ".");
    }
    public double getApprox () {
        double cos = 0;
        for (int i = 0; i <= getIteration(); i++) {
            cos += (Math.pow(-1, i))*(Math.pow(getValue(), 2*i))/factorial(2*i);
        }
        return cos;
    }
}
