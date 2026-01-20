import java.util.Scanner;
import java.util.ArrayList;
//เลือกใช้ arraylist แทน array เพราะจะได้ใช้ collection หา min max ได้เลย ไม่ต้องเขียนเอง
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> allx = new ArrayList<Double>();
        List<Double> ally = new ArrayList<Double>();
        String[] pointCount = {"First ", "Second ", "Third ", "Fourth "};
        double sumx = 0.0, sumy = 0.0, sumDis = 0.0;

        for (int i = 0 ; i < 4 ; i++) {
            System.out.print(pointCount[i]+ "point: ");
            allx.add(scanner.nextDouble());
            ally.add(scanner.nextDouble());
            sumx += allx.get(i);
            sumy += ally.get(i);
        }

        double centroidx = sumx/4.0;
        double centroidy = sumy/4.0;

        List<Double> distance = new ArrayList<>();
        for (int i = 0 ; i < 4 ; i++) {
            distance.add(Math.sqrt(Math.pow((centroidx-allx.get(i)),2)+
                    Math.pow((centroidy-ally.get(i)),2)));
            sumDis += distance.get(i);
        }

        double minDis = Collections.min(distance);
        double maxDis = Collections.max(distance);

        System.out.print("The centroid is ( "+centroidx+", "+centroidy+
                " ).\nSum of distance is "+sumDis+
                ".\nShortest distance is "+minDis+
                ".\nLongest distance is "+maxDis+".");
    }
}
