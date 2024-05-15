package Thread;

public class SetMoney extends Thread {
  @Override
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    Money.money = 9000;
  }
}
