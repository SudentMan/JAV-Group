public class Point {
    private double X1;
    private double Y1;
    public Point(double x ,double y){
        this.X1 = x;
        this.Y1 = y;
    }
    public double distance(Point D){
        double d = Math.sqrt(
                Math.pow(Math.abs(X1 - D.X1), 2)
              + Math.pow(Math.abs(Y1 - D.Y1),2)
        );
        return d;
    }
    public void translate(double x, double y){
        X1 += x;      Y1+=y;
    }
    public boolean equals(Point o){
        return this.X1 == o.X1 && this.Y1 == o.Y1;
    }
    public String toString(){
        return "(" + X1 +" , "+ Y1 + ")";
    }

}
