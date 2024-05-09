package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestDate {
  public static void main(String[] args) throws ParseException {
    // 表示电脑中的当前时间
    Date date = new Date();
    System.out.println(date);

    // 从时间原点开始，过了指定毫秒的时间，计算时区
    Date date2 = new Date(0L);
    System.out.println(date2);

    // 获取时间对应的毫秒值
    Date date3 = new Date();
    System.out.println(date.getTime());
    // 修改时间
    date3.setTime(1000L);
    System.out.println(date3);

    // SimpleDateFormat类，传空参时使用默认格式
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    System.out.println(sdf.format(date3));
    String s = "2012-12-09 12:55:20";
    Date date4 = sdf.parse(s);
    System.out.println(date4);

    // LocalDateTime类
    LocalDateTime localDateTime = LocalDateTime.now(); // 获取当前时间
    System.out.println(localDateTime);
    LocalDateTime localDateTime2 = LocalDateTime.of(2024, 5, 9, 12, 18, 20);
    System.out.println(localDateTime2);
    System.out.println(localDateTime2.getYear());
    System.out.println(localDateTime2.getMonthValue());
    System.out.println(localDateTime2.getDayOfMonth());
    System.out.println(localDateTime2.getDayOfWeek());
    System.out.println(localDateTime2.getDayOfYear());
    System.out.println(localDateTime2.getMinute());
    System.out.println(localDateTime2.getHour());

    // LocalDate类 LocalTime类
    LocalDate localDate = localDateTime.toLocalDate();
    LocalTime localTime = localDateTime.toLocalTime();
    System.out.println(localDate);
    System.out.println(localTime);

    // LocalDateTime格式化
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String s2 = localDateTime2.format(formatter);
    System.out.println(s2);
    LocalDateTime localDateTime3 = LocalDateTime.parse(s, formatter);
    System.out.println(localDateTime3);

    // LocalDateTime操作方法
    LocalDateTime localDateTime4 = localDateTime2.plusYears(-10000); // 返回一个新的对象
    System.out.println(localDateTime4);
    LocalDateTime localDateTime5 = localDateTime2.withMonth(10);
    System.out.println(localDateTime5);
    LocalDateTime localDateTime6 = localDateTime2.withYear(2020);
    System.out.println(localDateTime6);

    // Period类获取时间间隔
    LocalDate localDate1 = LocalDate.of(2020, 1, 1);
    LocalDate localDate2 = LocalDate.of(2022, 3, 1);
    Period period = Period.between(localDate1, localDate2);
    System.out.println(period);
    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());
    System.out.println(period.toTotalMonths());

    // Period类获取时间间隔
    LocalDateTime localDateTime7 = LocalDateTime.of(2024, 5, 9, 12, 18, 20);
    LocalDateTime localDateTime8 = LocalDateTime.of(2025, 8, 9, 12, 18, 20);
    Duration duration = Duration.between(localDateTime7, localDateTime8);
    System.out.println(duration);
    System.out.println(duration.toSeconds());
    System.out.println(duration.toMillis());
    System.out.println(duration.toNanos());
  }
}
