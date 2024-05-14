package Thread;

public class MyThread extends Thread {

  public MyThread() {
  }

  public MyThread(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(getName() + "线程开启了" + i); // getName获取线程默认名字
    }
  }


}
