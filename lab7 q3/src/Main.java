import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();

        System.out.print("Enter a positive integer : ");
        int num = scanner.nextInt();
        System.out.print("Prime factors of "+num+" are");
        ArrayList<Integer> factors = obj.primeFactor(num);
        for(int i = 0; i < factors.size(); i++){
            if(i != factors.size() -1 )
                System.out.print(" "+factors.get(i)+",");
            else
                System.out.print(" "+factors.get(i)+".");
        }

        scanner.close();
    }

    ArrayList<Integer> primeFactor(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        if (n <= 1) {
            return list;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);

                int nextN = n;
                while (nextN % i == 0) {
                    nextN /= i;
                }

                list.addAll(primeFactor(nextN));
                break;
            }
        }

        return list;
    }
}