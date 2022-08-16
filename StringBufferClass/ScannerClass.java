package StringBufferClass;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name");
        String s1= sc.nextLine();
        for (int i=s1.length()-1;i>0;i--){
            System.out.println(s1.charAt(i));
        }
    }
}
