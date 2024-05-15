package Thread;

public class TestVolatile {
  public static void main(String[] args) {
    GetMoney getMoney = new GetMoney();
    SetMoney setMoney = new SetMoney();

    getMoney.start();
    setMoney.start();
  }
}
