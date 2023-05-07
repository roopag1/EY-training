package Thread_demo;

    
class ThreadTwo implements Runnable {
    public void run() {
        for(int i =0;i<=5;i++) {
            System.out.println("Thread Two Show");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class Threads{
    public static void main(String[] args) {
        Runnable ch1 = () -> {
                for(int i =0;i<=5;i++) {
                    System.out.println(" Thread One Show");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
        ThreadTwo ch2 = new ThreadTwo();
        System.out.println(Thread.currentThread().getName());
         /*
        ch1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(ch1.getPriority());
        System.out.println(ch2.getPriority());*/
        Thread t1 = new Thread(ch1);
        Thread t2 = new Thread(ch2);
        t1.start();
        t2.start();
    }
}