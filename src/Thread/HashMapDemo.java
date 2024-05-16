package Thread;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo {
  public static void main(String[] args) throws InterruptedException {
//   HashMap<String, String> hashMap = new HashMap<>();
//    Hashtable<String, String> hashMap = new Hashtable<>(); // 锁整张hash表
    ConcurrentHashMap<String, String> hashMap = new ConcurrentHashMap<>(); // JDK1.7 锁hash小表

    Thread thread1 = new Thread(() -> {
      for (int i = 0; i < 25; i++) {
        hashMap.put("" + i, "" + i);
      }
    });

    Thread thread2 = new Thread(() -> {
      for (int i = 25; i < 51; i++) {
        hashMap.put("" + i, "" + i);
      }
    });

    thread1.start();
    thread2.start();

    Thread.sleep(1000);
    for (int i = 0; i < 51; i++) {
      System.out.println(hashMap.get("" + i));
    }
  }
}
