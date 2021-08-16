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

        System.out.println(convertStringNumberToIntegerFunction(6));
        System.out.println(convertStringNumberToIntegerFunction(100));

        Double number = 90.909837D;
        Supplier<Double> mathRound = () -> Double.valueOf(Math.round(number));
        System.out.println("Round double number: " + mathRound.get());
    }

    private static void printChars(char[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static String convertStringNumberToIntegerFunction(int number) {
        Function<Integer, String> function = key -> {

            String[] values = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
            return key > 0 && key < 11 ? values[key - 1] : "unknown";
        };
        return function.apply(number);
    }
}
