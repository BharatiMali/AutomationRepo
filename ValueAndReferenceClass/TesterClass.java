package ValueAndReferenceClass;

public class TesterClass {
         int data;
     public void addition  (int data){
         data = data + 100;
       System.out.println(data);

   }
   public static void main ( String [] args){
       TesterClass ts= new TesterClass();
       System.out.println( "Before calling the method"  + ts.data);
          ts.addition(100);
          System.out.println("After calling the method " +ts.data);
   }
}
