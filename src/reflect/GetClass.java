package reflect;

import com.test.Student;

import java.lang.reflect.Constructor;

public class GetClass {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
    // 获取class的三种方式

    Class<?> aClass = Class.forName("com.test.Student");
    System.out.println(aClass);

    Class<?> aClass2 = Student.class;
    System.out.println(aClass2);

    Student student = new Student();
    System.out.println(student.getClass());



  }
}
