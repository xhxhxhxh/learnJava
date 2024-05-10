package testLambda;

interface ShowLambda {
  void show();
}

public class TestLambda {
  public static void main(String[] args) {
    useShowLambda(() -> System.out.println("Hello Lambda"));
  }

  public static void useShowLambda(ShowLambda showLambda) {
    showLambda.show();
  }
}


