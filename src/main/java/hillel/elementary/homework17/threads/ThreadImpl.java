package hillel.elementary.homework17.threads;

public class ThreadImpl extends Thread {

    public ThreadImpl(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int count = 0; count < 1000; count++) {
            Helper.readThreadNameAndIncrVar();
        }
    }
}
