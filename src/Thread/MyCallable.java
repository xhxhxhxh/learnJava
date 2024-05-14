package Thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
  @Override
  public String call() throws Exception {
    for (int i = 0; i < 100; i++) {
      System.out.println("Callable开启了" + i);
    }
    return "Callable结束";
  }
}
