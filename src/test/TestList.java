package test;

import java.util.ArrayList;
import java.util.List;

public class TestList {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");

    // 添加到指定位置
    list.add(0, "S");
    System.out.println(list);

    // 删除指定索引元素，返回被删除元素
    String s = list.remove(1);
    System.out.println(list);
    System.out.println(s);

    // 修改指定索引元素值，返回被修改的值
    String s2 = list.set(1, "A");
    System.out.println(list);
    System.out.println(s2);

    // 修改指定索引元素值
    String s3 = list.get(1);
    System.out.println(s3);
  }
}
