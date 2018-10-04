class Five{
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        obj1.start();
        
        Hello obj2 = new Hello();
        Thread t1 = new Thread(obj2);
        t1.start();

    }
}

class Hi extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }
    }
    
}

class Hello implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
            }
        }
    }
}