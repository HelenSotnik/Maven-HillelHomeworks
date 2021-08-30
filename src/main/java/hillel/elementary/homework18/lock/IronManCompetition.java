package hillel.elementary.homework18.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IronManCompetition {
    private Lock lock = new ReentrantLock();

    public void swim() {
        lock.lock();
        System.out.println("First part of IronMan: swim 4000 meters in the open water.");
    }

    public void rideABicycle() {
        lock.lock();
        System.out.println("Second part of IronMan: ride 180 km on bicycle.");

    }

    public void runMarathon() {
        System.out.println("Third part of IronMan: run 42 km");
        lock.unlock();
    }
}
