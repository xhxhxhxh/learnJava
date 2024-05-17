package reflect;

import java.lang.reflect.Constructor;

public class GetConstructor {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
    Class<?> aClass = Class.forName("com.test.Student");
    // 获取构造方法
    Constructor[] constructors = aClass.getConstructors(); // 能获取到共有的构造方法
    for (Constructor constructor: constructors) {
      System.out.println(constructor);
    }

    Constructor[] constructors2 = aClass.getDeclaredConstructors(); // 能获取到共有+私有的构造方法
    for (Constructor constructor: constructors2) {
      System.out.println(constructor);
    }

    Constructor<?> constructor = aClass.getConstructor(); // 获取单个无参构造
    System.out.println(constructor);

    Constructor<?> constructor2 = aClass.getConstructor(String.class, int.class, String.class, String.class); // 获取单个共有有参构造
    System.out.println(constructor2);

    Constructor<?> constructor3 = aClass.getDeclaredConstructor(String.class); // 获取单个私有有参构造
    System.out.println(constructor3);
  }
}
