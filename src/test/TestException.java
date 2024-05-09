package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestException {
  public static void main(String[] args) throws ParseException {
    test();
    try {
      test2();
    } catch (NullPointerException e) {
      System.out.println("数组不能为null");
      System.out.println(e.getMessage());
      System.out.println(e.toString());
      e.printStackTrace(); // 把异常的信息打印到控制台 字体为红色
    }
//    test3();
    System.out.println("嘿嘿嘿");
  }

  // 编译时异常的声明不可以省略
  public static void test() throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    sdf.parse("2012-08-09 12:20:10");
  }

  // 运行时异常的声明可以省略
  public static void test2() throws NullPointerException {
    int[] arr = null;
    for (int i = 0; i < arr.length; i++) {}
  }

  public static void test3() {
    System.out.println("hello");
    throw new RuntimeException(); // 手动抛出异常
  }
}

