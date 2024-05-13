package test;

import java.io.File;
import java.io.IOException;

public class TestFile {
  public static void main(String[] args) throws IOException {
    String path = "C:\\Users\\Administrator\\Desktop\\111.txt";
    File file = new File(path);
    System.out.println(file);

    String dir = "C:\\Users\\Administrator\\Desktop";
    String fileName = "111.txt";
    File file2 = new File(dir, fileName);
    System.out.println(file2);

    File file3 = new File(dir);
    File file4 = new File(file3, fileName);
    System.out.println(file4);

    // 相对路径(从当前项目开始)
    File file5 = new File("myJava/myJava.iml");
    System.out.println(file5);

    // 创建当前文件，已存在返回false
    boolean result = file.createNewFile();
    System.out.println(result);

    // 创建目录，只能创建单级
    String dir2 = "C:\\Users\\Administrator\\Desktop\\hello";
    File file6 = new File(dir2);
    file6.mkdir();

    // 创建目录，可以创建多级
    String dir3 = "C:\\Users\\Administrator\\Desktop\\hello\\1\\2";
    File file7 = new File(dir3);
    file7.mkdirs();

    // 删除文件或文件夹，如果文件夹中有其他文件则删除失败
    file7.delete();

    // 判断时文件还是文件夹
    System.out.println(file.isFile());
    System.out.println(file6.isDirectory());

    // 是否存在
    System.out.println(file.exists());

    // 获取文件名
    System.out.println(file.getName());

    // 获取目录下所有文件和文件夹
    File[] files = file6.listFiles();
    for (File path2: files) {
      System.out.println(path2);
    }
  }
}
