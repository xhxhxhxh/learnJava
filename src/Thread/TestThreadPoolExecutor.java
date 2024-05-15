package Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPoolExecutor {
  public static void main(String[] args) {
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
        2,
        5,
        2,
        TimeUnit.MINUTES,
        new ArrayBlockingQueue<>(1),
        Executors.defaultThreadFactory(),
        new ThreadPoolExecutor.CallerRunsPolicy()); // 超出队列数抛出错误
    // DiscardPolicy() 不抛出错误
    // DiscardOldestPolicy() 抛弃队列中等待最久的任务，然后把当前任务加入到队列中
    // CallerRunsPolicy 绕过线程池直接执行

    for (int i = 0; i < 15; i++) {
      int finalI = i;
      threadPoolExecutor.submit(() -> System.out.println(Thread.currentThread().getName() + "在执行" + finalI));
    }

    threadPoolExecutor.shutdown();
  }
}
