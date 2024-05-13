package test;

import java.util.Arrays;

public class TestByte {
  public static void main(String[] args) {
    String s = "你好呀";
    byte[] b = s.getBytes();
    System.out.println(Arrays.toString(b));

    byte[] b2 = {-28, -67, -96, -27, -91, -67, -27, -111, -128};
    String s2 = new String(b2);
    System.out.println(s2);

  }
}
