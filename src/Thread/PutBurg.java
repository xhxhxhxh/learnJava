package Thread;

import java.util.concurrent.ArrayBlockingQueue;

public class PutBurg extends Thread {
  private ArrayBlockingQueue<String> queue;
  PutBurg (ArrayBlockingQueue<String> queue) {
    this.queue = queue;
  }
  @Override
  public void run() {
    while (true) {
      try {
        queue.put("汉堡");
        System.out.println("放入汉堡");
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

    }
  }
}
