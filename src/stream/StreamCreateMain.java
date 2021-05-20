package stream;

import java.util.*;
import java.util.function.DoubleSupplier;
import java.util.function.UnaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * jdk1.8之后 接口当中可以有默认方法
 */

public class StreamCreateMain {
    public static void main(String[] args) {
        //通过Collection对象的stream()串行流
        //通过Collection对象的parallelStream()并行流
        List<String> list = new ArrayList<>();
        list.add("苹果");
        list.add("香蕉");
        Stream<String> stream1 = list.stream();
        stream1.forEach(item -> System.out.println(item));
        System.out.println("通过Collection对象的stream()串行流----------------");

        //通过 Arrays.stream()方法
        int[] a = {0, 9, 8};
        IntStream stream2 = Arrays.stream(a);
        stream2.forEach(System.out::println);
        System.out.println("Arrays.stream----------------");

        //通过  Stream.of()、   Stream.iterate()、Stream.generate()方法
        Stream<Integer> stream3 = Stream.of(1, 2, 3);
        stream3.forEach(System.out::println);
        System.out.println("Stream.of----------------");

        //种子，一元操作符  从0开始 之后每次加2
        Stream<Integer> stream4 = Stream.iterate(0, x -> x + 2);
        //limit取前10
        stream4.limit(10).forEach(System.out::println);
        System.out.println(" Stream.iterate----------------");

        Stream<Integer> stream5 = Stream.generate(() -> new Random().nextInt(100));
        stream5.limit(2).forEach(System.out::println);
        System.out.println(" Stream.generate----------------");

        //通过IntStream LongStream   DoubleStream 接口中的 of range rangeClosed方法
        IntStream stream6 = IntStream.of(1, 2);
        stream6.forEach(System.out::println);
        System.out.println("IntStream.of----------------");

        //包括2
        IntStream stream7 = IntStream.rangeClosed(0, 2);
        stream7.forEach(System.out::println);
        System.out.println("IntStream.rangeClosed----------------");

        //不包括2
        IntStream stream8 = IntStream.range(0, 2);
        stream8.forEach(System.out::println);
        System.out.println("IntStream.range----------------");

        //public interface UnaryOperator<T> extends Function<T, T>
        //是函数型接口
        UnaryOperator<Integer> dda = x -> x + 1;
        //11
        System.out.println(dda.apply(1));
        //a1
        UnaryOperator<String> ddb = x -> x + 1;
        System.out.println(ddb.apply("aa"));


        //filter、limit、skip、distinct、sorted、
        //map
        //parallel
    }
}
