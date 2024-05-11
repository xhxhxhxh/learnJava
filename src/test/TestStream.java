package test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {
  public static void main(String[] args) {
    // 单列集合
    ArrayList<String> list = new ArrayList<>(List.of("王五","张三", "李四"));
    list.stream().forEach(s -> System.out.println(s));

    // 双列集合
    HashMap<String, String> map = new HashMap<>(Map.ofEntries(Map.entry("姓名", "张三"), Map.entry("性别", "男")));
    map.keySet().stream().forEach(s -> System.out.println(s));
    map.entrySet().stream().forEach(s -> System.out.println(s));

    // 同类数据
    Stream.of(1,2,3,4,5,6,7,8,9,10).forEach(System.out::println);

    // filter方法
    list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

    // limit方法 截取指定参数个数的数据
    list.stream().limit(2).forEach(s -> System.out.println(s));

    // skip方法 跳过指定参数个数的数据
    list.stream().skip(2).forEach(s -> System.out.println(s));

    // concat方法 合并两个流
    Stream.concat(list.stream(), list.stream()).forEach(s -> System.out.println(s));

    // distinct方法 去除重复元素
    Stream.concat(list.stream(), list.stream()).distinct().forEach(s -> System.out.println(s));

    System.out.println(list.stream().count()); // 获取个数
    list.stream().sorted().forEach(s -> System.out.println(s));
    list.stream().forEach(s -> System.out.println(s));

    // stream转list
    List<String> list2 = list.stream().collect(Collectors.toList());
    System.out.println(list2);

    // stream转set
    Set<String> set = list.stream().collect(Collectors.toSet());
    System.out.println(set);

    ArrayList<String> list3 = new ArrayList<>(List.of("王五 20","张三 25", "李四 30"));
    // stream转map
    Map<String, Integer> map2 = list3.stream().collect(Collectors.toMap(s -> s.split(" ")[0], s -> Integer.parseInt(s.split(" ")[1])));
    System.out.println(map2);
  }
}
