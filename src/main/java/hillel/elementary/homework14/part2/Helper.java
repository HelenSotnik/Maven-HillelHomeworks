package hillel.elementary.homework14.part2;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    public Optional adjustString(String email)  {
        String regEx = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);

        if (email != null) {
            Matcher matcher = pattern.matcher(email);
            while (!matcher.matches() || email.isBlank()) {
                return Optional.empty();
            }
        }
        return Optional.ofNullable(email);
    }
}
