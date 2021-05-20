package anonymous;

public class MyRunnableMain {
    public static void main(String[] args) {
        System.out.println("主线程1");
        Runnable MyRunnable = new MyRunnable();
        Thread t1 = new Thread(MyRunnable);
        t1.start();
        System.out.println("主线程2");
    }
}
