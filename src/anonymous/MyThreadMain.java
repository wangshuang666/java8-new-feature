package anonymous;

public class MyThreadMain {
    public static void main(String[] args) {
        System.out.println("主线程1");
        Thread thread = new MyThread();
        thread.start();
        System.out.println("主线程2");
    }
}
