package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TestProperties {
  public static void main(String[] args) throws IOException {
    Properties prop = new Properties();

    // 添加
    prop.put("name", "张三");
    prop.put("age", "22");
    prop.put("sex", "男");

    prop.setProperty("11", "22");

    // 删除
    prop.remove("sex");

    // 修改
    prop.put("name", "李四");

    System.out.println(prop);

    // 查询
    System.out.println(prop.get("name"));
    System.out.println(prop.getProperty("age"));

    // 遍历
    Set<Object> keys = prop.keySet();
    Set<String> strings = prop.stringPropertyNames();
    System.out.println(strings);
    for (Object key : keys) {
      System.out.println(key + "----" + prop.get(key));
    }

    Set<Map.Entry<Object, Object>> entries = prop.entrySet();
    for (Map.Entry<Object, Object> entry : entries) {
      System.out.println(entry.getKey() + "----" + entry.getValue());
    }

    // 读取
    FileReader fr = new FileReader("C:\\Users\\Administrator\\Desktop\\prop.properties");
    Properties prop2 = new Properties();
    prop2.load(fr);
    fr.close();
    System.out.println(prop2);

    // 保存
    prop2.put("username", "lisi");
    FileWriter fw = new FileWriter("C:\\Users\\Administrator\\Desktop\\prop.properties");
    prop2.store(fw, "aaa"); // 第二个参数是注释
    fw.close();

  }
}
