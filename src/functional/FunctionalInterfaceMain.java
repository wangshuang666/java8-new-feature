package functional;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        //自定义函数式接口
        Usb usb =name-> System.out.println("Usb接口实现--"+name);
        usb.service("键盘");

        paly(name-> System.out.println("Usb接口实现--"+name),"鼠标");


        //常用函数式接口实现--消费型
        consumer((t)-> System.out.println("聚餐消费："+t),1000);
        consumer((t)-> System.out.println("唱歌消费："+t),500);

        //常用函数式接口实现--供给型
        System.out.println(Arrays.toString(supplier(()->new Random().nextInt(9),9)));

        //常用函数式接口实现--函数型
        System.out.println("把zhangsan编程大写："+function(name->name.toUpperCase(),"zhangsan"));
        //常用函数式接口实现--断言型
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu");
        System.out.println("names集合中是否包含zhangsan:"+predicate(list->list.contains("zhangsan"),names));

    }
    public static Boolean predicate(Predicate<List<String>> predicate ,List<String> names){
        return predicate.test(names);

    }

    public static String function(Function<String,String> function,String name){
        return function.apply(name);
    }

    public static Integer[] supplier(Supplier<Integer> supplier,Integer count){
        Integer[] arry = new Integer[count];
        for (int i = 0; i < count; i++) {
            arry[i]=supplier.get();
        }
        return arry;
    }

    public static void consumer(Consumer<Double> consumer,double money){
        consumer.accept(money);
    }


    public  static  void paly(Usb usb,String name){
        usb.service(name);
    }

}
