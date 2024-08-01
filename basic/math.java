package basic;

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int a = scan.nextInt();
     
      if (a%3 == 0 && a%5 == 0) {
        System.out.println("yes it is divide by 3 and 5");
      } else {
        System.out.println("no it is not divide by 3 and 5");
      }
    }
    
}

















