package Thread;

import java.util.concurrent.locks.ReentrantLock;

public class Desk {
  public static boolean hasHamburg = false;

  public static ReentrantLock lock = new ReentrantLock();
}
