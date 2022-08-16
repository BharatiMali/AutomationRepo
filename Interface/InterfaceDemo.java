package Interface;

public class InterfaceDemo extends Myinterface {
 public void m1()
 {
     System.out.println(" Wel Come bharati");
 }
 public static void main( String [] args){
     InterfaceDemo id = new InterfaceDemo();
     id.m1();
     System.out.println(id.x);

 }
}

