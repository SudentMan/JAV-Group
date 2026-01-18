import java.util.Scanner;
 class Main{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Point A: ");
        String d1 = sc.nextLine();
        System.out.print("Point B: ");
        String d2 = sc.nextLine();

        int space1 = d1.trim().indexOf(" ");
        int space2 = d2.trim().indexOf(" ");
        double x1 = Double.parseDouble(d1.trim().substring(0, space1));
        double x2 = Double.parseDouble(d2.trim().substring(0, space2));
        double y1 = Double.parseDouble(d1.trim().substring(space1+1));
        double y2 = Double.parseDouble(d2.trim().substring(space2+1));

        Point P1 = new Point(x1,y1);
        Point P2 = new Point(x2,y2);
      //System.out.println("A = "+ P1.toString() +"  B = "+P2.toString() + " Distance = " +P1.distance(P2));
        System.out.printf("A = %s  B = %s  Distance = %.1f\n",P1.toString(),P2.toString(),P1.distance(P2));

        System.out.print("Move the points: ");
        String d3 = sc.nextLine();
        int space3 = d3.indexOf(" ");
        double x3 = Double.parseDouble(d3.trim().substring(0, space3));
        double y3 = Double.parseDouble(d3.trim().substring(space3+1));
        P1.translate(x3,y3);
        P2.translate(x3,y3);
        System.out.printf("A = %s  B = %s  Distance = %.1f\n",P1.toString(),P2.toString(),P1.distance(P2));
       if (P1.equals(P2)) {
              System.out.println("A and B are at the same position.");
       } else {
              System.out.println("A and B are not at the same position.");
       }
       }

}