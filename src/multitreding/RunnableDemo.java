package multitreding;

/**
 * Created by rajan on 25/10/17.
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("codekul");
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo=new RunnableDemo();
        Thread thread=new Thread(runnableDemo);
        thread.start();
    }
}
