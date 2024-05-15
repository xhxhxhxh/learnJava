package Thread;

public class Foodie extends Thread{
  @Override
  public void run() {
    while (true) {
      synchronized (Desk.lock) {
        try {
          if (Desk.hasHamburg) {
            System.out.println("吃货开吃了");
            Desk.hasHamburg = false;
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
