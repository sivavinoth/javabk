package medium;

public class cls {

    String name ="";
    String pros ="";
    String cons ="";
    int price =0;
 
    public static void main(String[] args) {

        cls lap1 = new cls();
        lap1.name = "Lenovo";
        lap1.pros = "fast";
        lap1.cons = "slow";
        lap1.price = 50000;

        cls lap2 = new cls();
        lap2.name = "Dell";
        lap2.pros = "good";
        lap2.cons = "bad";
        lap2.price = 60000;

        System.out.println(lap1.name);

    }
}
      