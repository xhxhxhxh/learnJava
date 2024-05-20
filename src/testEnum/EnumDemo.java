package testEnum;

import java.util.Arrays;

public class EnumDemo {
  public static void main(String[] args) {
    System.out.println(Season.SPRING);
    System.out.println(Season.SUMMER.name());
    System.out.println(Season.AUTUMN.ordinal()); // 返回枚举项的索引
    System.out.println(Season.SUMMER.compareTo(Season.SPRING)); // 根据索引比较
    System.out.println(Season.SUMMER.toString());

    Season winter = Season.valueOf(Season.class, "WINTER");
    System.out.println(winter);
    System.out.println(Arrays.toString(Season.values())); // 返回所有值的数组
  }
}
