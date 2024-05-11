package test;

import java.util.HashSet;

public class TestHashSet {
  public static void main(String[] args) {
    HashSet<String> hs = new HashSet<>();
    hs.add("C");
    hs.add("AA");
    hs.add("B");
    hs.add("A");

    for (String s : hs) {
      System.out.println(s.hashCode()); // 根据对象地址值计算出哈希值
      System.out.println(s);
    }
  }
}
