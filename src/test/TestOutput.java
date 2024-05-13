package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestOutput {
  public static void main(String[] args) throws IOException {
    // 创建字节流输出对象，文件不存在则创建，存在则清空里面的数据, 第二个参数可以开启续写功能
    FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\111.txt");

    // 写入
    fos.write(97);
    fos.write(98);
    fos.write("\r\n".getBytes());

    byte[] bys = {99, 100, 101, 102, 103, 104, 105};
    fos.write(bys);
    fos.write(bys, 5, 2);

    // 释放资源
    fos.close();
  }
}
