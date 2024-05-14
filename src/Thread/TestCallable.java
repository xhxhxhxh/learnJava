package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestCallable {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    MyCallable myCallable = new MyCallable();

    FutureTask<String> futureTask = new FutureTask<>(myCallable);
    FutureTask<String> futureTask2 = new FutureTask<>(myCallable);

    Thread thread = new Thread(futureTask);
    Thread thread2 = new Thread(futureTask2);

    thread.start();
    thread2.start();

    System.out.println(futureTask.get()); // 会一直等到线程运行结束之后
    System.out.println(futureTask2.get());
  }
}
