package hillel.elementary.homework18.lock;

public class LockTest {
    static IronManCompetition lockExample = new IronManCompetition();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            private IronManCompetition ironMan = lockExample;

            @Override
            public void run() {
                ironMan.swim();
                ironMan.rideABicycle();
                ironMan.runMarathon();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            private IronManCompetition ironMan = lockExample;

            @Override
            public void run() {
                ironMan.swim();
                ironMan.rideABicycle();
                ironMan.runMarathon();
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            private IronManCompetition ironMan = lockExample;

            @Override
            public void run() {
                ironMan.swim();
                ironMan.rideABicycle();
                ironMan.runMarathon();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
