public class ThreadTest2 {

  public static void main(String[] args) {

    for (int i = 0; i < 40; i++) {
      new Thread(new ThreadTest2().new MyThreadFactory()).start();
    }

  }

  class MyThreadFactory implements Runnable {

    @Override
    public void run() {
      try {
        Thread.sleep((int) (Math.random() * 5)*1000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

      System.out.println("hi from run() "+Thread.currentThread().getName());
      

    }

  }
  
}