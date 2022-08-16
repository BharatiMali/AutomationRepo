package downCasting;

public class Child extends  Parent {
    public void msg (){
        System.out.println("Hello Child");

    }
    public void sleep(){
        System.out.println("Child sleeping");

    }
    public static void main( String[] args){
        Parent p = new Child ();
        p.msg();
       // p.sleep();

        Child c = (Child)p;
        c.sleep();
    }
}
