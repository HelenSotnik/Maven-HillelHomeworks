package hillel.elementary.homework17.deadlock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cappuccino {
    private Americano americano;

    public synchronized String getMessage() {
        return "CoffeeMachine is preparing Cappuccino. Hold on, Please! ";
    }

    public synchronized String getAmericanoMessage() {
        return americano.getMessage();
    }
}
