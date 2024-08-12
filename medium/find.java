package medium;
import java.util.Scanner;



public class find {
    void evenorodd(int num){
        if (num%2==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scan.nextInt();
        find obj = new find();
        obj.evenorodd(num);
    
}
}