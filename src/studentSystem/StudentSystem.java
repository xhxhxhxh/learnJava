package studentSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
  private static Scanner scanner;
  private static ArrayList<Student> studentList = new ArrayList<>();
  private static Student cacheStudent;
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
    String input = scanner.next();
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
    Student student = null;
    if (cacheStudent == null) {
      student = new Student();
      cacheStudent = student;
    } else {
      student = cacheStudent;
    }
    checkAll(student);
    cacheStudent = null;
    studentList.add(student);
    System.out.println("添加成功！！");
  }

  public static void checkAll(Student student) {
    String id = student.getId();
    if (id == null || id.isEmpty()) {
      System.out.println("请输入学生学号(例如：01、02、11)");
      String studentId = scanner.next();
      if (!checkId(studentId)) {
        checkAll(student);
        return;
      }
      student.setId(studentId);
    }

    String name = student.getName();
    if (name == null || name.isEmpty()) {
      System.out.println("请输入学生姓名");
      String studentName = scanner.next();
      if (checkName(studentName)) {
        student.setName(studentName);
      } else {
        checkAll(student);
        return;
      }
    }

    if (student.getAge() <= 0 || student.getAge() > 130) {
      System.out.println("请输入学生年龄");
      if (!scanner.hasNextInt()) {
        scanner.next();
        System.out.println("年龄不合法，请重新输入");
        checkAll(student);
        return;
      }
      int studentAge = scanner.nextInt();
      if (checkAge(studentAge)) {
        student.setAge(studentAge);
      } else {
        checkAll(student);
        return;
      }
    }

    String gender = student.getGender();
    if (gender == null || gender.isEmpty()) {
      System.out.println("请输入学生性别(男/女)");
      String studentGender = scanner.next();
      if (checkGender(studentGender)) {
        student.setGender(studentGender);
      }else {
        checkAll(student);
      }

    }
  }

  public static boolean checkId(String studentId) {
    String idRegex = "[0-9]{2,}";
    if (!studentId.matches(idRegex)) {
      System.out.println("学号格式不正确，请重新输入");
      return false;
    }

    Student existStudent = findStudent(studentId);
    if (existStudent != null) {
      System.out.println("学号已存在，请重新输入");
      return false;
    }
    return true;
  }

  public static boolean checkName(String studentName) {
    String nameRegex = "[\\u4e00-\\u9fa5]{2,}";
    if (studentName.matches(nameRegex)) {
      return true;
    } else {
      System.out.println("姓名格式不正确，请重新输入");
      return false;
    }
  }

  public static boolean checkAge(int studentAge) {
    if (studentAge > 0 && studentAge <= 130) {
      return true;
    } else {
      System.out.println("年龄格式不正确，请重新输入");
      return false;
    }
  }

  public static boolean checkGender(String studentGender) {
    if (studentGender.equals("男") || studentGender.equals("女")) {
      return true;
    } else {
      System.out.println("性别格式不正确，请重新输入");
      return false;
    }
  }

  public static Student findStudent(String studentId) {
    for (int i = 0; i < studentList.size(); i++) {
      Student student = studentList.get(i);
      if (student.getId().equals(studentId)) {
        return student;
      }
    }
    return null;
  }

  public static void removeStudent() {
    System.out.println("请输入要删除学生的学号");
    String studentId = scanner.next();
    Student student = findStudent(studentId);
    if (student != null) {
      studentList.remove(student);
      System.out.println("删除成功！！");
    } else {
      System.out.println("删除失败，请确认是否存在该学生");
    }
  }

  public static void updateStudent() {
    if (cacheStudent == null) {
      System.out.println("请输入要更新的学生学号");
      String studentId = scanner.next();
      Student student = findStudent(studentId);
      if (student == null) {
        System.out.println("不存在该学生");
        return;
      } else {
        cacheStudent = new Student();
        cacheStudent.setId(studentId);
      }
    }

    checkAll(cacheStudent);
    Student student = findStudent(cacheStudent.getId());
    if (student != null) {
      student.setAge(cacheStudent.getAge());
      student.setName(cacheStudent.getName());
      student.setGender(cacheStudent.getGender());
    }

    cacheStudent = null;
    System.out.println("学生信息更新成功");
  }

  public static void checkStudent() {
    System.out.println("学号 -- 姓名 -- 年龄 -- 性别");
    for (int i = 0; i < studentList.size(); i++) {
      Student student = studentList.get(i);
      System.out.println(student.getId() + " -- " + student.getName() +  " -- " + student.getAge() +  " -- " + student.getGender());
    }
  }
}
