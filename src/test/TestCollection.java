package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
  public static void main(String[] args) {
    // ArrayList不能存储基本数据类型
    // ArrayList<int> list = new ArrayList<int>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(2);
    System.out.println(list);

    Collection<String> collection = new ArrayList<>();
    collection.add("aaa");
    collection.add("bbb");
    collection.add("ccc");
    System.out.println(collection);
    boolean res = collection.remove("aaa");
    System.out.println(res);
    System.out.println(collection);
    // 删除符合要求的元素，删除成功返回false
    boolean res2 = collection.removeIf(s -> s.equals("bbb"));
    System.out.println(res2);
    System.out.println(collection);

    // 清空集合
    collection.clear();
    System.out.println(collection);

    // 是否包含
    collection.add("aaa");
    boolean res3 = collection.contains("a");
    boolean res4 = collection.contains("aaa");
    System.out.println(res3);
    System.out.println(res4);

    // 是否为空和长度
    boolean res5 = collection.isEmpty();
    int size = collection.size();
    System.out.println(res5);
    System.out.println(size);

    ArrayList<String> list2 = new ArrayList<>();
    list2.add("a");
    list2.add("b");
    list2.add("b");
    list2.add("c");
    list2.add("d");

    Iterator<String> iterator = list2.iterator();
    while (iterator.hasNext()) {
      String s = iterator.next();
      System.out.println(s);
      if (s.equals("b")) {
        iterator.remove(); // 调用自带的remove
        // list2.remove(0); 报错，跟多线程相关？
      }
    }
    System.out.println(list2);

    // Iterator的增强for
    for (String s : list2) {
      System.out.println(s);
//      list2.remove(1);
    }
    System.out.println(list2);
  }
}
