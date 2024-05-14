package test;

import java.io.*;

public class TestObjectOutputStream {
  public static void main(String[] args) throws IOException {
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\111.txt"));

    User user = new User("zhangsan", "123456");

    // user需要实现Serializable接口
    oos.writeObject(user);

    oos.close();
  }
}
