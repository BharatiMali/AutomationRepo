package polymerphism;

public class MethodOverloading {
    public void multiple(int p, int q){    //method overLoading differnt parameters
        System.out.println(p + q);
    }
    public void multiple(float p, float q, float r, float s){
        System.out.println( p+q+r+s);

    }
    public static void main(String [] args){
        MethodOverloading test1 = new MethodOverloading();
        test1.multiple(50, 75);
        test1.multiple(55,45);
        test1. multiple(25.6f,45.55f,55.65f,75.75f);
    }
}
