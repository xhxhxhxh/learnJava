package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class Ice implements Runnable {
  private int count = 0;
  private AtomicInteger atomicInteger = new AtomicInteger();
  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      atomicInteger.incrementAndGet();
      System.out.println("还剩冰淇淋" + atomicInteger.get());
    }
  }
}
