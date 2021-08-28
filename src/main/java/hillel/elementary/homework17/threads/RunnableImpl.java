package hillel.elementary.homework17.threads;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {

        for (int count = 0; count < 1000; count++) {
            Helper.readThreadNameAndIncrVar();
        }
    }
}
