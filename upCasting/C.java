package upCasting;

public class C extends B {
    int x = 300;
    public static void main(String []args){
        C c = new C();
        System.out.println(c.x);

        B b = c;
        System.out.println(b.x);
        A a = c;
        System.out.println(a.x);

        A aa = new C();
    }
}
