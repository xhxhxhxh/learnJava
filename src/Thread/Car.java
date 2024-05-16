package Thread;

import java.util.concurrent.Semaphore;

public class Car implements Runnable{
  private final Semaphore semaphore = new Semaphore(2);
  @Override
  public void run() {
    try {
      semaphore.acquire();
      System.out.println("获得通行证");
      Thread.sleep(1000);

      System.out.println("收回通行证!!!");
      semaphore.release();
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

  }
}
