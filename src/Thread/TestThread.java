package Thread;

public class TestThread {
  public static void main(String[] args) throws InterruptedException {
    MyThread myThread = new MyThread("1号线程");
    MyThread2 myThread2 = new MyThread2("2号线程");

    // 设置线程名称
//    myThread.setName("1号线程");
//    myThread2.setName("2号线程");

    System.out.println(myThread.getPriority()); // 获取优先级
    System.out.println(myThread2.getPriority());

    myThread.setPriority(10); // 设置优先级, 优先级越高越快执行完毕
    myThread2.setPriority(1);

    // 守护线程，当普通线程执行完之后，守护线程没有继续执行下去的必要了
    myThread2.setDaemon(true);

    myThread.start();
    myThread2.start();

    // Thread.sleep(1000); // 休眠，毫秒

    System.out.println(Thread.currentThread().getName()); // 获取当前线程名称
  }
}
