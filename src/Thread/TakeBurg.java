package Thread;

import java.util.concurrent.ArrayBlockingQueue;

public class TakeBurg extends Thread {
  private ArrayBlockingQueue<String> queue;
  TakeBurg (ArrayBlockingQueue<String> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    while (true) {
      try {
        queue.take();
        System.out.println("拿汉堡"); // take和put都加了线程锁，但打印语句没加，可能会引起重复显示
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

    }
  }
}
