package medium;

public class inher {
    class A{
        int a=10;
    }
    class B extends A{
        
    }
    class C extends B{
     
    }

    public static void main(String[] args) {

        inher obj = new inher();
        B ob = obj.new B();
        C o = obj.new C();
        // System.out.println(obj.a);
        System.out.println(ob.a);
        System.out.println(o.a);
    }

    
}
