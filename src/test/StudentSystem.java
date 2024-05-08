package test;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StudentSystem {
  private static Scanner scanner;
  static ArrayList<Student> studentList = new ArrayList<>();
  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    welcome();
  }

  public static void welcome() {
    String text = """
                -------------------
                欢迎使用学生管理系统
                1.添加学生
                2.删除学生
                3.更新学生
                4.查看学生
                5.退出
                -------------------
                """;
    System.out.println(text);
    String input = scanner.nextLine();
    switch (input) {
      case "1":
        addStudent();
        break;
      case "2":
        removeStudent();
        break;
      case "3":
        updateStudent();
        break;
      case "4":
        checkStudent();
        break;
      case "5":
        return;
      default:
        System.out.println("指令错误，请重新输入");
    }

    welcome();
  }

  public static void addStudent() {
    Student lastStudent = studentList.get(studentList.size() - 1);
    Student student = new Student();
    if (lastStudent.isEffective()) {
      studentList.add(student);
    } else {
      student = lastStudent;
    }

    if (student.getId().isEmpty()) {
      System.out.println("请输入学生学号(例如：01、02、11)");
      String studentId = scanner.nextLine();
      String idRegex = "[0-9]{2,}";
      if (!studentId.matches(idRegex)) {
        System.out.println("学号格式不正确，请重新输入");
        addStudent();
        return;
      }

      Student existStudent = findStudent(studentId);
      if (existStudent != null) {
        System.out.println("学号已存在，请重新输入");
        addStudent();
        return;
      }

      student.setId(studentId);
    }

    if (student.getName().isEmpty()) {
      System.out.println("请输入学生姓名");
      String studentName = scanner.nextLine();
      String nameRegex = "[\\u4e00-\\u9fa5]{2,}";
      if (studentName.matches(nameRegex)) {
        student.setName(studentName);
      } else {
        System.out.println("姓名格式不正确，请重新输入");
        addStudent();
        return;
      }
    }

    if (student.getAge() <= 0 || student.getAge() > 130) {
      System.out.println("请输入学生年龄");
      int studentAge = scanner.nextInt();
      if (studentAge > 0 && studentAge <= 130) {
        student.setAge(studentAge);
      } else {
        System.out.println("年龄格式不正确，请重新输入");
        addStudent();
        return;
      }
    }

    if (student.getGender().isEmpty()) {
      System.out.println("请输入学生性别(男/女)");
      String studentGender = scanner.nextLine();
      if (studentGender.equals("男") || studentGender.equals("女")) {
        student.setGender(studentGender);
      } else {
        System.out.println("性别格式不正确，请重新输入");
        addStudent();
      }
    }
    student.setEffective(true);
    System.out.println("添加成功！！");
  }

  public static Student findStudent(String studentId) {
    for (int i = 0; i < studentList.size(); i++) {
      Student student = studentList.get(i);
      if (student.getId().equals(studentId) && student.isEffective()) {
        return student;
      }
    }
    return null;
  }

  public static void removeStudent() {
    System.out.println("请输入学生学号(例如：01、02、11)");
    String studentId = scanner.nextLine();
    Student student = findStudent(studentId);
    if (student != null) {
      studentList.remove(student);
      System.out.println("删除成功！！");
    } else {
      System.out.println("删除失败，请确认是否存在该学生");
    }
  }

  public static void updateStudent() {

  }

  public static void checkStudent() {
    System.out.println("学号 -- 姓名 -- 年龄 -- 性别");
    for (int i = 0; i < studentList.size(); i++) {
      Student student = studentList.get(i);
      if (student.isEffective()) {
        System.out.println(student.getId() + " -- " + student.getName() +  " -- " + student.getAge() +  " -- " + student.getGender());
      }
    }
  }
}
