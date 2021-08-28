package hillel.elementary.homework17.threads;

public class Helper {
    public static int COUNT = 1;

    public static int readThreadNameAndIncrVar() {
        String name = Thread.currentThread().getName();

        System.out.print(name + COUNT + " ");
        return COUNT++;
    }
}
