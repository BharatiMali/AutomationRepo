package constructorinjava;

public class PrivateConstructor {
    int a,b;
    PrivateConstructor (int a, int b ){
      System.out.println(a+b);

    }
    public static void main(String[] args){
        //PrivateConstructor c = new PrivateConstructor();
        PrivateConstructor PrivateConstructor = new PrivateConstructor( 30,40);
        PrivateConstructor PrivateConstructor1 = new PrivateConstructor( 40,50);
        PrivateConstructor PrivateConstructor2 =   new PrivateConstructor( 50,60);



    }
}
