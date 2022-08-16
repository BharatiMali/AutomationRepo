package constructorinjava;

public class ThisKeyword {
    int s,t;
    ThisKeyword (int s,int t) {
        this.s = s;
        this.t = t;
    }
    public void display (){
        System.out.println ( s + " "+ t);
        this.method1();

    }
    public void method1(){
        System.out.println ( " Method");

    }
       public static void main(String[] args ){
           ThisKeyword ThisKeyword = new ThisKeyword ( 50, 75);
           ThisKeyword.display();
    }

}
