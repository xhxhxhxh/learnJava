package Thread;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomInteger {
  public static void main(String[] args) {
    AtomicInteger atomicInteger = new AtomicInteger(10); //
    System.out.println(atomicInteger);

    System.out.println(atomicInteger.get()); // 获取值

    System.out.println(atomicInteger.getAndIncrement()); // 先获取后加1
    System.out.println(atomicInteger.get());

    System.out.println(atomicInteger.incrementAndGet()); // 先加1后获取

    System.out.println(atomicInteger.addAndGet(10)); // 先加后获取

    System.out.println(atomicInteger.getAndAdd(10)); // 先获取后加
    System.out.println(atomicInteger.get());

    System.out.println(atomicInteger.getAndSet(50)); // 先获取后设置
    System.out.println(atomicInteger.get());
  }
}
