package hillel.elementary.homework18.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {
    private static AtomicInteger atomicInteger = new AtomicInteger(50000);

    public static void main(String[] args) throws InterruptedException {
        Thread myThread1 = new Thread(ThreadTest::method);
        myThread1.setName("Thread1");

        Thread myThread2 = new Thread(ThreadTest::method);
        myThread2.setName("MyThread2");

        myThread1.start();
        myThread2.start();

        Thread.sleep(1000);
        System.out.println("atomic integer: " + atomicInteger.get());
    }

    private static synchronized void method() {
        for (int i = 10000; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            atomicInteger.decrementAndGet();
        }
    }
}
