package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataTimeFormatterMain {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = dateTimeFormatter.format(LocalDate.now());
        System.out.println(format);
        LocalDate parse = LocalDate.parse("2021-04-18", dateTimeFormatter);
        System.out.println(parse);
    }
}
