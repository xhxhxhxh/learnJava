package Thread;

public class Cookie extends Thread{
  @Override
  public void run() {
    while (true) {
      synchronized (Desk.lock) {
        try {
          if (!Desk.hasHamburg) {
            System.out.println("厨师开始制作汉堡");
            Desk.hasHamburg = true;
            Desk.lock.notifyAll();
          } else {
            Desk.lock.wait();
          }
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }

    }
  }
}
