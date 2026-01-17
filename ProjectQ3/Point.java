public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }


    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }


    public boolean equals(Point other) {
        double epsilon = 1e-9;
        return Math.abs(this.x - other.x) < epsilon &&
               Math.abs(this.y - other.y) < epsilon;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }
}