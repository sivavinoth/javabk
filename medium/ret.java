package medium;

import java.util.Scanner;


public class ret {
    
String getname(){
    Scanner scan = new Scanner(System.in);
    String name =scan.nextLine();
    return name;
}
int getphone(){
    Scanner scan = new Scanner(System.in);
    int ph =scan.nextInt();
    return ph;
}
public static void main(String[] args) {
    ret obj = new ret();
    obj.getname();
    obj.getphone();
}

}



