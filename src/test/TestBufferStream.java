package test;

import java.io.*;

public class TestBufferStream {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\功能虚拟样机设计以及综合支持工具-朱鲁鲁.docx");
    BufferedInputStream bis = new BufferedInputStream(fis);

    FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\222.docx");
    BufferedOutputStream bos = new BufferedOutputStream(fos);

    while (true) {
      int result = bis.read();
      System.out.println(result);
      if (result == -1) {
        break;
      } else {
        bos.write(result);
      }
    }

    bis.close();
    bos.close();
  }
}
