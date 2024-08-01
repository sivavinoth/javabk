package basic;

import java.util.Scanner;

class array {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b =scan.nextInt();
        for (int i = a;i <= b ;i++){
            System.out.println(i);
        }
    }
}
