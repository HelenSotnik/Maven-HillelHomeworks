package hillel.elementary.homework17.threads;

public class ThreadImpl extends Thread {
    private String name;

    public ThreadImpl(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);

        for (int count = 0; count < 1000; count++) {
            Helper.readThreadNameAndIncrVar();
        }
    }
}
