public class Sine extends Taylor{
    private double total = 0;
    public Sine(int k, double x){
        super(k,x);
    }
    public void printValue(){
        total = 0;
        for(int i = 0 ; i <= super.getIteration() ; i++){
            total += (Math.pow(-1,i)*Math.pow(getValue(),2*i+1))/(factorial(2*i+1));
        }
        System.out.println("Value from Math.sine() " + Math.sin(getValue()) + "." + "\nApproximated value is " + total +".");
    }
    public double getApprox() {
        return total;
    }
}
