package anonymous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class LambdaMain {
    public static void main(String[] args) {
        System.out.println("主线程第一步");
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("正常匿名内部类无参");
            }
        };
        //new Thread()省略了
        //方法名称省略了
        //()代表无参方法，不能省略
        //->箭头表达式
        //lambad如果方法体就一句话可以省略大括号
        Runnable thread2 = () -> System.out.println("Lambda无参");


        new Thread(runnable1).start();
        new Thread(thread2).start();
        new Thread(() -> System.out.println("正常匿名内部类无参")).start();
        System.out.println("主线程第二步");


        Comparator c1 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };
        //方法名可以省略
        //参数不能省略

        Comparator<String> c2 = (String o1, String o2) -> {
            return o1.length() - o2.length();
        };
        //参数类型可以省略
        //参数名不可以省略
        Comparator<String> c3 = (o1, o2) -> o1.length() - o2.length();

        String[] str = {"aadsaf", "dqwd", "dqwfcsqc", "xqsccaac", "csfwffqaf", "czxca", "cas", "cacs", "casc"};
        Arrays.sort(str, c3);
        System.out.println(Arrays.toString(str));


    }
}
