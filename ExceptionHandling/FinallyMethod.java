package ExceptionHandling;

public class FinallyMethod {
    public static void main(String[] args){
        try{
            int a=5/1;
        }
        catch (Exception e){
            System.out.println(e);

        }
        finally {
            System.out.println(" This is in 'finally' it always get run");
        }
    }
}
