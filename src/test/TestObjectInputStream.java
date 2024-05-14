package test;

import java.io.*;

public class TestObjectInputStream {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\111.txt"));

    User user = (User)ois.readObject();
    System.out.println(user);

    ois.close();
  }
}
