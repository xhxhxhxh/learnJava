package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
  public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\111.txt");

    fw.write(97);

    char[] c = {98, 99, 100, 101, 102};
    fw.write(c);

    String s = "你好";
    fw.write(s);

    // 刷新流
    fw.flush();

//    fw.close();

    BufferedWriter fw2 = new BufferedWriter(fw);
    fw2.newLine();
    fw2.write("我是谁");
    fw2.close();
  }
}
