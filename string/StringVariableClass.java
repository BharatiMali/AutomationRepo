package string;

public class StringVariableClass {
    public static void main(String [] args){
        int p = 45;
        float s = 45.8f;
        char c = 'B';
        String S1= "Good Moring Pune";     //liters
        String S2 = new String( "Good Moring Pune");       //new keyword
        System.out.println(S1==S2);
        System.out.println(S1.equals(S2));
    }
}
