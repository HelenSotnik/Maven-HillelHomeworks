package hillel.elementary.homework17.deadlock;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Americano {
    private Cappuccino cappuccino;

    public synchronized String getMessage() {
        return "CoffeeMachine is preparing Americano. Hold on, Please! ";
    }

    public synchronized String getCappuccinoMessage() {
        return cappuccino.getMessage();
    }
}
