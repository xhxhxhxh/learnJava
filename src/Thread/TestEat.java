package Thread;

public class TestEat {
  public static void main(String[] args) {
    Foodie foodie = new Foodie();
    Cookie cookie = new Cookie();

    foodie.start();
    cookie.start();
  }
}
