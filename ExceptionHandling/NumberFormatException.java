package ExceptionHandling;

class NumberFormatException{
    public static void main(String[] args){
        String str = " pankaj ";
        try
        {
            int a = Integer.parseInt(str);          //risky code
            System.out.println(a);

            System.out.println("String Number Format Exception");
        }
        catch (java.lang.NumberFormatException n)
        {
            System.out.println(" String "+str+" can't be converted to Integer");
        }
        System.out.println(" main method ended");
    }
}
