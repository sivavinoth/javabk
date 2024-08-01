package basic;
import java.util.Scanner;
public class ter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int f =scan.nextInt();
        System.out.println(f);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = a > b ? a : b;
        System.out.println( max);

        int n = 10;
        for(int i=n ;i>=1;i=i-1){
            System.out.println(i);
        }
    }
}







