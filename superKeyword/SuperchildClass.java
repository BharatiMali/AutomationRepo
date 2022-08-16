package superKeyword;

public class SuperchildClass extends SuperParentClass {
    int t = 45;
    public void Chain(){
        int u = 55;
        System.out.println(u);
        super.Key();
    }

    public static void main(String[] args){
        SuperchildClass test1 = new SuperchildClass();
        System.out.println(test1.t);
        test1.Chain();
    }
}
