public class Truck extends Car {
    private double M_weight, weight;

    public Truck(double gas, double efficiency, double M_weight, double weight){
        super(gas, efficiency);
        this.M_weight = M_weight;
        if (weight>M_weight){
            this.weight = M_weight;
        }
        else{
            this.weight = weight;
        }
    }
    @Override
    public void drive(double distance){
        double usage = distance/getEfficiency();
        double extra = 1.0;
        if (weight < 1){
            extra = 1.0;
        }
        else if (weight <= 10){
            extra = 1.1;
        }
        else if (weight <= 20){
            extra = 1.2;
        }
        else{
            extra = 1.3;
        }
        if (getGas()<usage*extra){
            System.out.println("You cannot drive too far, please add gas");
        }
        else{
            setGas(getGas()-(usage*extra));
        }
    }
}
