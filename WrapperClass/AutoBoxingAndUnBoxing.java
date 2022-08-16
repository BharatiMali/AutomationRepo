package WrapperClass;

public class AutoBoxingAndUnBoxing {

    public static void main(String[]args){
        int a = 10;
        float f = 10.5f;
        Integer integer = 100;                 //unboxing class
        float float1 = f;
        int c = integer;
        String s = integer.toString();              //unboxing class

        System.out.println(integer);
        System.out.println(float1);
        System.out.println(s);                //unboxing class


    }

}
