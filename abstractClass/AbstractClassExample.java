package abstractClass;

public abstract class AbstractClassExample {

   int p = 25;
    AbstractClassExample (int p, int q){
        System.out.println(p+q);
    }
    public static void Multiplication (int s, int t ){
        System.out.println(s*t);

    }
    public abstract void squre();
    public static void main(String[] args){
        AbstractClassExample.Multiplication(25, 75);
        AbstractClassExample.Multiplication(90 , 5);
    }




   }


