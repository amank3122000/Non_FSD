package Upskilling_Day4;

//class A implements Runnable {
//    public void run() {
//        for (int i=0; i<5; i++) {
//            System.out.println("Hi");
//            try {
//                Thread.sleep(15);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//class B implements Runnable {
//    public void run() {
//        for (int i=0; i<5; i++) {
//            System.out.println("Hello");
//            try {
//                Thread.sleep(15);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }
}
public class TryCatchFinally {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();
        Runnable obj1 = () -> {
                for (int i=0; i<1000; i++) {
//                    System.out.println("Hi");
                    c.increment();
                }
        };
        Runnable obj2 = () -> {
                for (int i=0; i<1000; i++) {
//                    System.out.println("Hello");
                    c.increment();
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
//        obj2.setPriority(Thread.MAX_PRIORITY);
//        System.out.println(obj1.getPriority());
//        System.out.println(obj2.getPriority());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}
