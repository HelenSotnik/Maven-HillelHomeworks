package hillel.elementary.homework4;

import hillel.elementary.homework4.exceptions.StringFormatException;
import hillel.elementary.homework4.utils.StringHelper;
import hillel.elementary.homework4.utils.Helper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myString = " Art is a life! ";
        char[] array = {' ', 'd', 'e', 'k', 'o', ' '};

        StringHelper helper = new StringHelper();
        try {
            System.out.println("Adjusted string: " + helper.adjustSting(myString, array));
        } catch (StringFormatException e) {
            e.printStackTrace();
        }

        Helper help = new Helper();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valid telephone: " + help.validatePhoneNumber(scanner));

        System.out.println("Valid email: " + help.validateEmail(scanner));

        System.out.println("Valid date of birth: " + help.validateDateOfBirthday(scanner));
        scanner.close();
    }
}
