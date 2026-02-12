public class Cosine extends Taylor{
    private  double total = 0;
    public Cosine(int k, double x){
        super(k,x);
    }
    public void printValue(){
        total =0;
        for(int i = 0 ; i <= super.getIteration() ; i++){
            total += (Math.pow(-1,i)*Math.pow(getValue(),2*i))/(factorial(2*i));
        }System.out.println("VValue from Math.cos() " + Math.cos(super.getValue()) + "." + "\nApproximated value is " + total +".");
    }

    @Override
    public double getApprox() {
        return total;
    }
}
