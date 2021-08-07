package hillel.elementary.homework14.part2;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Helper helper = new Helper();

        Optional<String> valid = helper.adjustString("politova@oogmail.com");
        Optional<String> nonValid = helper.adjustString("gsjajjajajjaajajajja.com");

        System.out.println(valid.get());
        System.out.println(nonValid.get());
    }
}
