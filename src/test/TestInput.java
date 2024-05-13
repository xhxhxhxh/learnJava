package test;

import java.io.FileInputStream;
import java.io.IOException;

public class TestInput {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\111.txt");

    // 一次读一个字节
//    int res = fis.read();
//    System.out.println((char)res);
//    while (true) {
//      int res2 = fis.read();
//      if (res2 == -1) {
//        break;
//      } else {
//        System.out.println((char)res2);
//      }
//    }

    // 一次读多个
    byte[] bytes = new byte[1024];
    int len = fis.read(bytes); // 本次读取的有效字节
    System.out.println(len);

    fis.close();
  }
}
