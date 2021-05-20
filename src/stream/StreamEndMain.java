package stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamEndMain {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        //forEach
        list.stream().forEach(System.out::println);
        System.out.println("forEach------------");
        System.out.println(list.stream().min((o1, o2) -> o1 - o2).get());
        System.out.println("min------------");
        System.out.println(list.stream().max((o1, o2) -> o1 - o2).get());
        System.out.println("max------------");
        System.out.println(list.stream().max((o1, o2) -> o1 - o2).get());
        System.out.println(list.stream().count());
        System.out.println("count------------");
        System.out.println(list.stream().reduce((x, y) -> x + y).get());
        System.out.println("reduce------------");
        System.out.println(list.stream().collect(Collectors.toSet()));
        System.out.println("collect------------");
    }
}
