package test;

import studentSystem.Student;

import java.util.Comparator;
import java.util.TreeSet;

public class TestSet {
  public static void main(String[] args) {
    // 需要实现排序方法
//    TreeSet<Student> set = new TreeSet<>();
    TreeSet<Student> set = new TreeSet<>(Comparator.comparingInt(Student::getAge));
    Student student1 = new Student();
    student1.setAge(20);
    Student student2 = new Student();
    student2.setAge(40);
    Student student3 = new Student();
    student3.setAge(30);

    set.add(student1);
    set.add(student2);
    set.add(student3);

    for (Student student : set) {
      System.out.println(student.getAge());
    }
  }
}
