package Thread;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {
  public static void main(String[] args) {
    CountDownLatch countDownLatch = new CountDownLatch(3);

    Son son1 = new Son(countDownLatch, "张三",10);
    Son son2 = new Son(countDownLatch, "李四",15);
    Son son3 = new Son(countDownLatch, "王五",20);

    Mother mother = new Mother(countDownLatch);

    mother.start();
    son1.start();
    son2.start();
    son3.start();

  }
}
