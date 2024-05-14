package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable {
  private int tickets = 100;
  private ReentrantLock lock = new ReentrantLock();
  @Override
  public void run() {
    method2();
  }

  public int getTickets() {
    return tickets;
  }

  public void setTickets(int tickets) {
    this.tickets = tickets;
  }

  public void method1() {
    while (true) {
      synchronized (this) { // 上锁，或者将关键字放到method的返回值前
        try {
          Thread.sleep(100);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
        if (tickets > 0) {
          tickets--;
          System.out.println(Thread.currentThread().getName() + "在买票，剩余票数" + tickets);
        } else {
          break;
        }
      }

    }
  }

  public void method2() {
    while (true) {
      lock.lock();
      try {
          Thread.sleep(100);
        if (tickets > 0) {
          tickets--;
          System.out.println(Thread.currentThread().getName() + "在买票，剩余票数" + tickets);
        } else {
          break;
        }
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      } finally {
        lock.unlock();
      }
    }
  }
}
