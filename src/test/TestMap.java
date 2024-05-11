package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();

    map.put("name", "张三");
    map.put("sex", "男");
    map.put("edu", "大学");

    System.out.println(map);

    String name = map.put("name", "李四"); // 如果添加的键已存在，会将原先的值返回
    System.out.println(name);
    System.out.println(map);

    map.remove("edu"); // 删除一个键值对， 会将删除的值返回
    System.out.println(map);

    System.out.println(map.containsKey("name")); // 是否包含
    System.out.println(map.containsValue("男"));

    map.clear(); // 清空
    System.out.println(map);

    System.out.println(map.isEmpty()); // 是否为空
    System.out.println(map.size()); // 长度

    map.put("name", "张三");
    map.put("sex", "男");
    map.put("edu", "大学");

    Set<String> keys = map.keySet();
    for (String key : keys) {
      String value = map.get(key);
      System.out.println(key + "---" + value);
    }

    Set<Map.Entry<String, String>> entries = map.entrySet();
    for (Map.Entry<String, String> entry : entries) {
      String value = entry.getValue();
      String key = entry.getKey();
      System.out.println(key + "---" + value);
    }

    map.forEach((key, value) -> System.out.println(key + "---" + value));
  }
}
