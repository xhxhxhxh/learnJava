package unitTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitTest {
  public static void main(String[] args) {

  }

  @Before
  public void before() {
    System.out.println("before");
  }

  @After
  public void after() {
    System.out.println("after");
  }

  @Test
  public void add() {
    System.out.println("hello");
  }
}
