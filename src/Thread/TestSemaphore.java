package Thread;

public class TestSemaphore {
  public static void main(String[] args) {
    Car car = new Car();

    for (int i = 0; i < 50; i++) {
      new Thread(car).start();
    }
  }
}
