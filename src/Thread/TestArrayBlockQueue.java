package Thread;

import java.util.concurrent.ArrayBlockingQueue;

public class TestArrayBlockQueue {
  public static void main(String[] args) throws InterruptedException {
    ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

    queue.put("汉堡");

    System.out.println(queue.take());
    // System.out.println(queue.take());
    System.out.println("结束");

    PutBurg putBurg = new PutBurg(queue);
    TakeBurg takeBurg = new TakeBurg(queue);

    putBurg.start();
    takeBurg.start();
  }
}
