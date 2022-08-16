package LanguageFundamentals.JavaCodingStandards;

public class JavaStaticBlockMethod {
    static int s ;                      //static variable
    static {
        s = 55;
        System.out.println(" Static  Block Method. " + s);

    }
    public static void main(String[] args) {
        JavaStaticBlockMethod test1 = new JavaStaticBlockMethod();
        System.out.println("Main Static Method");    // Main method
    }
}
