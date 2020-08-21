import java.util.HashSet;
import java.util.Set;

public class ThreadTest1 {

  static Set<String> s1 = new HashSet<>();

  public static void main(String[] args) throws InterruptedException {

    for (int i = 0; i < 40; i++) {

      new ThreadTest1().new MythreadFactory().start();

    }

  }

  class MythreadFactory extends Thread {

    public void run() {
      try {
        Thread.sleep((int) (Math.random() * 5) * 1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      System.out.println("Vanakkam da mapla run() la irundu!! " + Thread.currentThread().getName());

    }

  }
}
