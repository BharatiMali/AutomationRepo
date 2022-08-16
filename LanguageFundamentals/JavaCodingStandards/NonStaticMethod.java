package LanguageFundamentals.JavaCodingStandards;

public class NonStaticMethod {
    public int a = 50;

    public void NonStaticMethod(){
        int a = 50;
        System.out.println(a);


        }
        public static void main (String [] args){
            NonStaticMethod test1 = new NonStaticMethod();
            System.out.println(test1.a);
            test1.NonStaticMethod();


        }
    }

