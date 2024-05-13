package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
  public static void main(String[] args) throws IOException {
    FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\111.txt");

//    while (true) {
//      int len = fr.read();
//      if (len == -1) {
//        break;
//      } else {
//        System.out.println((char)len);
//      }
//    }

//    while (true) {
//      char[] chars = new char[1024];
//      int len = fr.read(chars);
//      if (len == -1) {
//        break;
//      } else {
//        System.out.println(new String(chars, 0, len));
//      }
//    }

    // 读取一整行，读不到返回null
    BufferedReader fr2 = new BufferedReader(fr);
    String s2 = fr2.readLine();
    System.out.println(s2);
    fr2.close();
  }

}
