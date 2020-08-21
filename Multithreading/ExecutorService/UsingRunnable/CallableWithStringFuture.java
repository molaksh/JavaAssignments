import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableWithStringFuture {
  private static int count = 0;

  private static Set<String> s1 = new HashSet<>();

  private static Map<Integer, String> m1 = new HashMap<>();

  private synchronized static void addToMap() {

    count++;

    m1.put(count, Thread.currentThread().getName());

    s1.add(Thread.currentThread().getName());

  }

  public static void main(String[] args) throws InterruptedException {
    
    //newCachedThreadPool creates multiple threads if any thread waiting while new threads need to be created, the waiting thread is used
    //ExecutorService ex = Executors.newCachedThreadPool();

    //newFixedThreadPool creates defined number of threads and uses them one by one.
    ExecutorService ex = Executors.newFixedThreadPool(5);

    List<Future<?>> allFutures = new ArrayList<>();

    for (int i = 0; i < 40; i++) {

      // ex.submit() deals with call() method of Callable interface which returns a value
        Future<String> future = ex.submit(new Callable<String>(){

          @Override
          public String call() throws Exception {
            try {
              Thread.sleep((int) (Math.random() * 5) * 1000);
            } catch (InterruptedException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
    
            addToMap();
    
            System.out.println(Thread.currentThread().getName());

            return "done";
          }
          
        });


        

      allFutures.add(future);

    }

    ex.shutdown();

    allFutures.stream().forEach(x -> {
      try {
        //future.get() function is a blocking function which does not allow the control to flow until the threads are terminated
        System.out.println(x.get());
      
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