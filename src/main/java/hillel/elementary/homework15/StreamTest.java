package hillel.elementary.homework15;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;

public class StreamTest {
    public static void main(String[] args) {

        proceedWithEmptyStream();
        proceedListToSetInStream();
        proceedSetToListInStream();
        proceedCollectionKeySetToCollectionInStream();
        proceedUniqueCollectionFromStringToIntegerInStream();
        proceedWithParallelStream();
        proceedWithReferenceMethodsInStream();
    }

    public static void proceedWithEmptyStream() {
        Optional<String> emptyStr = Stream.empty().map(str -> str + " - empty")
                .skip(1).findFirst();

      emptyStr.ifPresent(System.out::println);
    }

    public static void proceedListToSetInStream() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < 20; i++) {
            list.add(i);
        }

        Set<Integer> mySet = list.stream()
                .filter(i -> i <= 10)
                .limit(5)
                .collect(toSet());

        mySet.forEach(System.out::println);
    }

    public static void proceedSetToListInStream() {
        Set<DaysOfWeek> daysOfWeekSet = new HashSet<>();
        daysOfWeekSet.add(DaysOfWeek.MONDAY);
        daysOfWeekSet.add(DaysOfWeek.TUESDAY);
        daysOfWeekSet.add(DaysOfWeek.WEDNESDAY);
        daysOfWeekSet.add(DaysOfWeek.THURSDAY);
        daysOfWeekSet.add(DaysOfWeek.FRIDAY);
        daysOfWeekSet.add(DaysOfWeek.SATURDAY);
        daysOfWeekSet.add(DaysOfWeek.SUNDAY);

        List<DaysOfWeek> daysOfWeeksList = daysOfWeekSet.stream()
                .collect(toList());

        daysOfWeeksList.forEach(System.out::println);
    }

    public static void proceedCollectionKeySetToCollectionInStream() {
        Map<Integer, String> myMap = new HashMap<>();
        for (int i = 1; i < 16; i++) {
            myMap.put(i, "cat" + i);
        }

        Set<Integer> integerSet = myMap.keySet().stream().collect(toSet());
        integerSet.forEach(System.out::println);
    }

    public static void proceedUniqueCollectionFromStringToIntegerInStream() {
        List<String> collection = Arrays.asList("4", "6", "8",
                "14", "15", "18", "6", "99", "12", "2");

        collection.stream()
                .skip(1)
                .limit(8)
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }

    public static void proceedWithParallelStream() {
        Stream<Integer> myStream = Stream.of(4, 88, 0, -48, 6, 17, 82, 567, 99, 1, 1234);

        Optional<Integer> parallelStreamInteger = myStream.parallel()
                .filter(i -> i % 2 == 0)
                .sorted()
                .reduce((n, m) -> n + m);

        System.out.println(parallelStreamInteger);
    }

    public static void proceedWithReferenceMethodsInStream() {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("France", 9));
        countryList.add(new Country("Italy", 22));
        countryList.add(new Country("Brazil", 101));

        List<Integer> integerList = countryList.stream()
                .map(Country::getName)
                .skip(1)
                .map(StreamTest::parse)
                .sorted(Integer::compare)
                .collect(Collectors.toCollection(ArrayList::new));

        integerList.forEach(System.out::println);
    }

    public static Integer parse(String s) {
        return s.length();
    }
}
