package test;

import com.test.Student;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {
  public static void main(String[] args) {
    TreeMap<Student, String> map = new TreeMap<>();

    Student student1 = new Student();
    student1.setAge(20);
    Student student2 = new Student();
    student2.setAge(40);
    Student student3 = new Student();
    student3.setAge(30);

    map.put(student1, "江苏");
    map.put(student2, "上海");
    map.put(student3, "浙江");

    map.forEach((key, value) -> System.out.println(key.getAge() + "---" + value));

    ArrayList<String> list = new ArrayList<>(Set.of("A", "B", "C"));
    System.out.println(list);

    Map<String, String> map2 = Map.of("姓名", "张三", "性别", "男");
    map2.forEach((key, value) -> System.out.println(key + "---" + value));

    Map<String, String> map3 = Map.ofEntries(Map.entry("姓名", "张三"), Map.entry("性别", "男"));
    map3.forEach((key, value) -> System.out.println(key + "---" + value));
  }
}
