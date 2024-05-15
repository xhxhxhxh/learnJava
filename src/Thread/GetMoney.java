package Thread;

public class GetMoney extends Thread {
  @Override
  public void run() {
    while (true) {
      if (Money.money != 10000) break;
    }
    System.out.println("还有" + Money.money);
  }
}
