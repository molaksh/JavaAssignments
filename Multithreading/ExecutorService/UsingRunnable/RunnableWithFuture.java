import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableWithFuture {
  private static int count = 0;

  private static Set<String> s1 = new HashSet<>();

  private static Map<Integer, String> m1 = new HashMap<>();

  private synchronized static void addToMap() {

    count++;

    m1.put(count, Thread.currentThread().getName());

    s1.add(Thread.currentThread().getName());

  }

  public static void main(String[] args) throws InterruptedException {
    ExecutorService ex = Executors.newCachedThreadPool();

    List<Future<?>> allFutures = new ArrayList<>();

    for (int i = 0; i < 40; i++) {

      // submit deals with only run() method of Runnable interface
      Future<?> future = ex.submit(() -> {

        try {
          Thread.sleep((int) (Math.random() * 5) * 1000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }

        addToMap();

        System.out.println(Thread.currentThread().getName());

      }, null);

      allFutures.add(future);

    }

    ex.shutdown();

    allFutures.stream().forEach(x -> {
      try {
        //future.get() function is a blocking function which does not allow the control to flow until the threads are terminated
        x.get();
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (ExecutionException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    });

Thread.sleep(1000);
     

      m1.entrySet().stream().forEach(System.out::println);
      System.out.println(s1.size());
    }
  
}