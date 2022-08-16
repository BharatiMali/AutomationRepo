package constructorinjava;

public class DefaultConstructor {
    int p ;
    DefaultConstructor (){ // Default constructor

    }
    DefaultConstructor(int p, int q){
        System.out.println(p + q);

    }

    public static void main( String[] args) {
        DefaultConstructor r = new DefaultConstructor();
        DefaultConstructor DefaultConstructor = new DefaultConstructor(40, 60);
        System.out.println(r.p);


    }

}

