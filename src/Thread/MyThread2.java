package Thread;

public class MyThread2 extends Thread {

  public MyThread2() {
  }

  public MyThread2(String name) {
    super(name);
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println(getName() + "线程开启了" + i); // getName获取线程默认名字
    }
  }


}
