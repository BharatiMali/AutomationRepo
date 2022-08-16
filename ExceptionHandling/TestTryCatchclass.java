package ExceptionHandling;

public class TestTryCatchclass {
    public static void main(String[] args){
        System.out.println(" Main method started");
        int a= 10, b= 0, c;
        try {
            c= a/b;                           //arithmeticexception
            System.out.println(c);

        }
        catch (Exception e)
        {
            System.out.print(e);
        }
        System.out.println(" main method ended");
    }
}
