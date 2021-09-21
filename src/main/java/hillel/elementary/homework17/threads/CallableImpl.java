package hillel.elementary.homework17.threads;

import java.util.concurrent.Callable;

public class CallableImpl implements Callable<String> {
    @Override
    public String call() throws Exception {

        for (int count = 0; count < 1000; count++) {
            Helper.readThreadNameAndIncrVar();
        }
        return "FINISHED";
    }
}
