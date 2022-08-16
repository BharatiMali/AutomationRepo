package constructorinjava;

public class ParameterizedConstructor {
    int p;
    ParameterizedConstructor(){

    }
    ParameterizedConstructor (int p, int s){

    }
    public static void main(String[] args){
        ParameterizedConstructor q = new ParameterizedConstructor();
        ParameterizedConstructor ParameterizedConstructor = new ParameterizedConstructor( 75, 30);
        System.out.println(q.p);
    }

}
