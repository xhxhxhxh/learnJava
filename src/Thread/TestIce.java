package Thread;

public class TestIce {
  public static void main(String[] args) {
    Ice ice = new Ice();

    for (int i = 0; i < 100; i++) {
      Thread t1 = new Thread(ice);
      t1.start();
    }
  }
}
