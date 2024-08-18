package medium;
import java.util.Scanner;
public class school {
  String passorfail(int total_mark){

    if (total_mark>=40){
        return "pass";
    }       
    else{
        return "fail";
    }

  }
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Mark :");
    int total_mark = scan.nextInt();
    school obj = new school();
    String res = obj.passorfail(total_mark);
    System.out.println("result : "+res);

    
}
}





























