import java.util.Scanner;
public class Main {
     void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y;
        String[] a = new String[2];
        System.out.print("Enter x and y :");
        a = sc.nextLine().split(" ");
        x = Integer.parseInt(a[0]);
        y = Integer.parseInt(a[1]);
        System.out.println(power(x,y));
    }
    int power(int b, int p){
        if(p == 0){
            return 1;
        }
        return b*power(b,p-1);
    }


}