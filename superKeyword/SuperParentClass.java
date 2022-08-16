package superKeyword;

public class SuperParentClass {
    int v = 60;
    public void Key(){
        int n = 50;
        System.out.println(n);

    }
    public static void main(String[] args){
        SuperParentClass test1 = new SuperParentClass();
        System.out.println(test1.v);
        test1.Key();

    }
}
