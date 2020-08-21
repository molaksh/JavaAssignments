import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class RunnableWithNoFuture {
  public static void main(String[] args) {
    ExecutorService ex = Executors.newCachedThreadPool();

    for (int i = 0; i < 40; i++) {

      //submit deals with only run() method of Runnable interface
      ex.submit(() -> {

        try {
          Thread.sleep((int) (Math.random() * 5) * 1000);
        } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
        
        System.out.println(Thread.currentThread().getName());

        });
        
        
      }

      ex.shutdown();
    }
}