package MultiTheradingClass;

public class ThreadClass1 extends Thread {
    @Override
    public void run()
    {
        System.out.println("Thread :" + Thread.currentThread().getId());

    }
    public static void main(String [] args) throws Exception, ArithmeticException{
        int no = 10;
        for (int i=0; i<no;i++){
            ThreadClass1 threadClass1 = new ThreadClass1();
            threadClass1.start();

        }

    }
}
