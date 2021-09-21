package hillel.elementary.homework18.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {
    private static AtomicInteger atomicInteger = new AtomicInteger(40000);

    public static void main(String[] args) throws InterruptedException {
        Thread myThread1 = new Thread(ThreadTest::method);
        myThread1.start();

        Thread myThread2 = new Thread(ThreadTest::method);
        myThread2.start();

        Thread.sleep(2000);
        System.out.println("ATOMIC INTEGER: " + atomicInteger.get());
    }

    private static void method() {
        for (int i = 10000; i > 0; i--) {
            Thread thread = new Thread(() -> {
                atomicInteger.decrementAndGet();
            });
            thread.start();
        }
    }
}
