package hillel.elementary.homework17.threads;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<String> {
    private String name;

    public CallableImpl(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.currentThread().setName(name);

        for (int count = 0; count < 1000; count++) {
            Helper.readThreadNameAndIncrVar();
        }
        return "FINISHED";
    }
}
