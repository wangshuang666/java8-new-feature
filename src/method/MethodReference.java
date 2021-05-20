package method;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用
 */
public class MethodReference {
    public static void main(String[] args) {
        Consumer<String> consumer = fruits-> System.out.println(fruits);
        consumer.accept("香蕉");

        //如果lambad表达式中只调用了一个方法
        //并且这个lambad表达式的特点和接口的特点一样：只有一个参数  没有返回值
        //就可以使用方法引用 对象::实例方法
        Consumer<String> consumer1 =  System.out::println;
        consumer1.accept("苹果");

        //类::静态方法
        Comparator<Integer> comparator1 = (o1,o2)->Integer.compare(o1,o2);
        Comparator<Integer> comparator2 = Integer::compareTo;
        Integer[] array = {9,8,7,6,5,4};
        Arrays.sort(array, comparator2);
        System.out.println(Arrays.toString(array));

        //类::实例方法
        Function<String,String> function1= name->name.toUpperCase();
        System.out.println(function1.apply("zhangsan"));
        Function<String,String> function2= String::toUpperCase;
        System.out.println(function2.apply("zhangsan"));

        //类::new
        Supplier<ArrayList> supplier = ()->new ArrayList<>();
        System.out.println(supplier.get());
        Supplier<ArrayList> supplier1 = ArrayList::new;
        System.out.println(supplier1.get());

    }
}
