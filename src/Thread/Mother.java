package Thread;

import java.util.concurrent.CountDownLatch;

public class Mother extends Thread{
  private CountDownLatch countDownLatch;
  public Mother(CountDownLatch countDownLatch) {
    this.countDownLatch = countDownLatch;
  }

  @Override
  public void run() {
    try {
      countDownLatch.await();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println("饺子都吃完了");
  }
}
