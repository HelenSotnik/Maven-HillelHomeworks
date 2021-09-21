package hillel.elementary.homework17.threads;

public class RunnableImpl implements Runnable {
    private String name;

    public RunnableImpl(String name) {
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
