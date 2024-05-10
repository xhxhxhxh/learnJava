package test;

import java.util.LinkedList;

public class TestLinkList {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.add("a");
    list.add("b");
    list.add("c");

    list.addFirst("d"); // 添加到首位
    list.addLast("d"); // 添加到末位
    System.out.println(list);

    System.out.println(list.getFirst()); // 获取首位元素
    System.out.println(list.getLast()); // 获取末位元素

    list.removeFirst(); // 删除首位
    list.removeLast(); // 删除末位
    System.out.println(list);
  }
}
