package Thread;

public class MyRunnable implements Runnable{

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println("runnable线程开启了" + i);
    }
  }
}
