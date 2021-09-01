package hillel.elementary.homework17;

import hillel.elementary.homework17.deadlock.Americano;
import hillel.elementary.homework17.deadlock.Cappuccino;
import hillel.elementary.homework17.threads.CallableImpl;
import hillel.elementary.homework17.threads.Helper;
import hillel.elementary.homework17.threads.RunnableImpl;
import hillel.elementary.homework17.threads.ThreadImpl;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main thread started.");

        ThreadImpl thread1 = new ThreadImpl("ThreadImpl");
        thread1.start();

        try {
            thread1.join();
        } catch (Exception e) {
            System.out.println("Exception has been caught" + e);
        }

        RunnableImpl runnableImpl = new RunnableImpl("RunnableImpl");
        Thread thread2 = new Thread(runnableImpl);
        thread2.start();

        try {
            thread2.join();
        } catch (Exception e) {
            System.out.println("Exception has been caught" + e);
        }

        CallableImpl callableImpl = new CallableImpl("CallableImpl");
        FutureTask<String> futureTask = new FutureTask<>(callableImpl);
        Thread thread3 = new Thread(futureTask);
        thread3.start();

        System.out.println(futureTask.get());

        int counter = Helper.readThreadNameAndIncrVar();
        System.out.println("Counter value: " + counter);

        Thread.sleep(5000);
        System.out.println("Main thread finished.");


        System.out.println("5.1  RESULT before synchronized method vary from 2828 - 3000");
        System.out.println("5.2  RESULT from synchronized method equals 3000 - 3000");
        System.out.println("5.3  RESULT with join() method ThreadImpl 1-1000, RunnableImpl 1001-2000, CalllableImpl 2001-3000");


        deadlockProcedure();
    }

    private static void deadlockProcedure() {

        Cappuccino cappuccino = new Cappuccino();
        Americano americano = new Americano();

        cappuccino.setAmericano(americano);
        americano.setCappuccino(cappuccino);

        Thread thread1 = new Thread(() -> System.out.println(cappuccino.getAmericanoMessage()));
        Thread thread2 = new Thread(() -> System.out.println(americano.getCappuccinoMessage()));

        thread1.start();
        thread2.start();
    }
}
