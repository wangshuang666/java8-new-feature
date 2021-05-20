package stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMiddleMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.stream()
                .filter(item->item>5)
                .forEach(System.out::println);
        System.out.println("过滤大于5的数----------");
        list.stream()
                .limit(2)
                .forEach(System.out::println);
        System.out.println("取前两个----------");
        list.stream()
                .skip(2)
                .forEach(System.out::println);
        System.out.println("跳过前两个----------");
        list.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("去重----------");
        list.stream()
                .sorted((o1,o2)->o2-o1)
                .forEach(System.out::println);
        System.out.println("从大到小排序----------");

        list.stream()
                .map(e->e.doubleValue())
                .forEach(System.out::println);
        System.out.println("把一组数据映射成另外一组数据----------");
        list.parallelStream()
                .forEach(System.out::println);
        System.out.println("并行流----------");
    }
}
