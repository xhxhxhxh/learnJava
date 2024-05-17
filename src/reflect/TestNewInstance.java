package reflect;

import com.test.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestNewInstance {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<?> aClass = Class.forName("com.test.Student");
    Constructor<?> constructor = aClass.getConstructor(String.class, int.class, String.class, String.class); // 获取单个无参构造
    Student student = (Student) constructor.newInstance("张三", 22, "10", "男");
    System.out.println(student);

    Constructor<?> constructor2 = aClass.getDeclaredConstructor(String.class); // 获取单个无参构造
    constructor2.setAccessible(true); // 对私有构造取消访问检查
    Student student2 = (Student) constructor2.newInstance("张三");
    System.out.println(student2);
  }
}
