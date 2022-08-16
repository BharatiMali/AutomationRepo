package ExceptionHandling;

import java.util.Scanner;

public class ThrowDemo {
    void ageCheck (int age) throws Exception{
        if(age<18){
            throw new Exception(("You  are not eligible"));
        }
        else {
            System.out.println("You are eligible");
        }
        System.out.println(" not terminated");
    }
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the age");
            Integer age = sc.nextInt();
            ThrowDemo t = new ThrowDemo();
            t.ageCheck(age);
        } catch (Exception e) {

        }
    }
}
