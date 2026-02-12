public class Expo extends Taylor{
    private double total = 0;
    public Expo(int k, double x){
        super(k,x);
    }
    public void printValue() {
        total = 0;
        for (int i = 0; i <= super.getIteration(); i++){
            total += (Math.pow(super.getValue(),i))/super.factorial(i);
        }
        System.out.println("Value from Math.exp() is " + Math.exp(super.getValue()) + "." + "\nApproximated value is " + total +".");

    }
    public double getValue(){
        return total;
    }
    public double getApprox() {
        return total;
    }
}
