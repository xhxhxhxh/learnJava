package anno;

import testEnum.Season;

import java.lang.annotation.*;

// 元注解
@Target({ElementType.FIELD, ElementType.TYPE, ElementType.METHOD}) // 指定注解使用位置（成员变量、类、方法）
@Retention(RetentionPolicy.RUNTIME) // 注解存活时间，RUNTIME运行阶段，默认是源码阶段
@Inherited // 指定该注解可以被继承
public @interface Anno1 {
  // 基本类型
  int a() default 10;
  public String name() default "11";

  public String value();

  // class类型
  public Class clazz() default Anno2.class;

  // 注解类型
  public Anno2 anno() default @Anno2;

  // 枚举类型
  public Season season() default Season.SPRING;

  // 数组
  int[] arr() default {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


}
