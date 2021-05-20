package time;

import java.time.LocalDateTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getMonthValue());
        //新的时间对象
        LocalDateTime localDateTime = now.plusDays(2);
        System.out.println(localDateTime);
        System.out.println(now.minusMonths(1));
    }
}
