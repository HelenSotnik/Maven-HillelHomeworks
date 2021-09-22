package hillel.elementary.homework21.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft.Builder()
                .withModelName("Boeing 737-800")
                .withEngineName("LEAP-1B from CFM International")
                .withAge(14)
                .withPassengerCapacity(189)
                .withPayloadInKg(13600)
                .withLengthInM(33.6)
                .withHeightInM(12.5)
                .withWingSpanInM(35.8)
                .withMaxSpeed(850)
                .withRangeInKm(5.436)
                .build();

        System.out.println(aircraft);
    }

}
