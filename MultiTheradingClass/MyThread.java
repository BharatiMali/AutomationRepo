package MultiTheradingClass;

public class MyThread implements Runnable{

    ThreadLocal <Integer> ThreadLocal1= new ThreadLocal <> ();
    int count;
    
    @Override
    public void run() {
        count++;
        if (ThreadLocal1.get() != null) {
            ThreadLocal1.set(ThreadLocal1.get().intValue() + 1);
        }
        else {
            ThreadLocal1.set(0);
        }
        System.out.println("Count " + count);
        System.out.println("threadlocal :" + ThreadLocal1.get());
    }
    public static void main(String[] args){
        Thread MyThread = new Thread(new MyThread());
        MyThread.start();
    }

    private static void start() {
        Thread MyThread = new Thread(new MyThread());
        MyThread.start();
    }


}
