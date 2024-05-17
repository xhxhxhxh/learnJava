package reflect;

import com.test.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class GetMethod {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<?> aClass = Class.forName("com.test.Student");

    Method[] methods = aClass.getMethods(); // 所有公有方法，包含继承
    for (Method method : methods) {
      System.out.println(method);
    }

    System.out.println("-------");

    Method[] methods2 = aClass.getDeclaredMethods(); // 所有方法，不包含继承
    for (Method method : methods2) {
      System.out.println(method);
    }

    System.out.println("-------");

    System.out.println(aClass.getMethod("getAge"));
    System.out.println(aClass.getMethod("setAge", int.class));

    // 调用方法
    Constructor<?> constructor = aClass.getConstructor(String.class, int.class, String.class, String.class); // 获取单个无参构造
    Student student = (Student) constructor.newInstance("张三", 22, "10", "男");
    Method getAge = aClass.getMethod("getAge");
    Method setAge = aClass.getMethod("setAge", int.class);
    setAge.invoke(student, 30);
    System.out.println(getAge.invoke(student));
  }
}
