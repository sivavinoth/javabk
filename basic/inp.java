
package basic;
import java.util.Scanner;


class inp {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine(); 
        int age = scan.nextInt();
        scan.nextLine();
        String city = scan.nextLine();
       
        System.out.println("my name is "+name);
      
       System.out.println("my age is "+age);
       System.out.println("my city is "+city);
    }
    
}






























