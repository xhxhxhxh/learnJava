package com.test;

public class Student implements Comparable<Student> {
  public Student() {
  }

  public Student(String name, int age, String id, String gender) {
    this.name = name;
    this.age = age;
    this.id = id;
    this.gender = gender;
  }

  private Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  private String name;
  private int age;
  private String id;
  private String gender;

  @Override
  public int compareTo(Student o) {
    return this.age - o.age;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", id='" + id + '\'' +
        ", gender='" + gender + '\'' +
        '}';
  }
}
