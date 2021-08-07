package hillel.elementary.homework14.part3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestFunctionalInterfaces {
    public static void main(String[] args) {
        Predicate<Double> isBiggerThan1500 = salary -> salary > 1500.0;

        System.out.println(isBiggerThan1500.test(30000.0));
        System.out.println(isBiggerThan1500.test(800.0));

        Consumer<String> printCharsFromString = (myString) -> printChars(myString.toCharArray());
        printCharsFromString.accept("String");

        Function<Integer, String> changeNumberToString = number -> convert(number);
        System.out.println(changeNumberToString.apply(5));
        System.out.println(changeNumberToString.apply(100));

        Double number = 90.909837D;
        Supplier<Double> mathRound = () -> Double.valueOf(Math.round(number));
        System.out.println("Round double number: " + mathRound.get());
    }

    private static void printChars(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static String convert(int n) {
        switch (n) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            default:
                return "unknown";
        }
    }
}
