package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
  public static void main(String[] args) throws InterruptedException {
    // 创建线程池
    ExecutorService executorService = Executors.newCachedThreadPool();

    // 池中最大线程数
    ExecutorService executorService2 = Executors.newFixedThreadPool(10);

    executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在执行"));

    Thread.sleep(2000);

    executorService.submit(() -> System.out.println(Thread.currentThread().getName() + "在执行"));

    // 关闭
    executorService.shutdown();
  }
}
