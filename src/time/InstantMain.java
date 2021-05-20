package time;

import java.time.*;
import java.util.Date;
import java.util.Set;

/**
 * 时间戳
 */
public class InstantMain {
    public static void main(String[] args) {
        Instant now = Instant.now();
        //咱们地区和格林泥治时间差了8个小时
        System.out.println(now.toString());
        //比1970-01-01所差时间不差
        System.out.println(now.toEpochMilli());
        System.out.println(System.currentTimeMillis());
        //添加和减少时间
        Instant instant = now.plusSeconds(2);
        System.out.println(Duration.between(now,instant).getSeconds());
        //获取所有时区
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        for (String availableZoneId : availableZoneIds) {
          //  System.out.println(availableZoneId);
        }
        //获取当前时区
        System.out.println( ZoneId.systemDefault());

        //Date--->Instant---->LocalDateTime
        System.out.println("Date--->Instant---->LocalDateTime");
        Date date = new Date();
        System.out.println(date);
        Instant instant1 = date.toInstant();
        System.out.println(instant1);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant1, ZoneId.systemDefault());
        System.out.println(localDateTime);

        System.out.println("LocalDateTime--->Instant---->Date");
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.systemDefault());
        Instant instant2 = zonedDateTime.toInstant();
        System.out.println(instant2);
        Date from = Date.from(instant2);
        System.out.println(from);

    }
}
