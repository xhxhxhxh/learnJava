package test;

public class Student implements Comparable<Student> {
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

  public boolean isEffective() {
    return effective;
  }

  public void setEffective(boolean effective) {
    this.effective = effective;
  }



  private String name;
  private int age;
  private String id;
  private String gender;
  private boolean effective;

  @Override
  public int compareTo(Student o) {
    return this.age - o.age;
  }
}
