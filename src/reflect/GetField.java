package reflect;

import com.test.Student;

import java.lang.reflect.Field;

public class GetField {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
    Class<?> aClass = Class.forName("com.test.Student");

    for (Field field : aClass.getFields()) { // 所有公有变量
      System.out.println(field.getName());
    }

    for (Field field : aClass.getDeclaredFields()) {// 所有变量
      System.out.println(field.getName());
    }

//    Field name = aClass.getField("name");
//    System.out.println(name.getName());

    Field name = aClass.getDeclaredField("name");
    System.out.println(name.getName());

    Student student = (Student)aClass.newInstance();
    name.setAccessible(true); // 对私有变量取消访问检查
    name.set(student, "李四"); // 设置变量值
    System.out.println(student);
    System.out.println(name.get(student)); // 获取变量值

  }
}
