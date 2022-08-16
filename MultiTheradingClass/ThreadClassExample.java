package MultiTheradingClass;



public class ThreadClassExample implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread Runnable :" + Thread.currentThread().getId());

    }
    public static void main(String[] args){
        int no =7;
        for(int i=0; i<=no; i++){
            Thread ThreadClass1 = new Thread( new ThreadClassExample());
            ThreadClass1.start();
        }
    }
}
