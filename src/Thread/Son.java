package Thread;

import java.util.concurrent.CountDownLatch;

public class Son extends Thread{
  private int count;
  private CountDownLatch countDownLatch;
  private String name;

  public Son(CountDownLatch countDownLatch, String name, int count) {
    this.count = count;
    this.countDownLatch = countDownLatch;
    this.name = name;
  }

  @Override
  public void run() {
    for (int i = 0; i < count; i++) {
      System.out.println(name + "正在吃第" + (i + 1) + "个饺子");
    }
    countDownLatch.countDown();
  }
}
