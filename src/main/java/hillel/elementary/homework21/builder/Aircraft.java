package hillel.elementary.homework21.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Aircraft {
    private String modelName;
    private String engineName;
    private int age;
    private int passengerCapacity;
    private int maxSpeed;
    private double rangeInKm;
    private int payloadInKg;
    private double lengthInM;
    private double heightInM;
    private double wingSpanInM;

    protected Aircraft() {
    }

    public static class Builder {
        private Aircraft newAircraft;

        public Builder() {
            newAircraft = new Aircraft();
        }

        public Builder withModelName(String modelName) {
            newAircraft.modelName = modelName;
            return this;
        }

        public Builder withEngineName(String engineName) {
            newAircraft.engineName = engineName;
            return this;
        }

        public Builder withAge(int age) {
            newAircraft.age = age;
            return this;
        }

        public Builder withPassengerCapacity(int passengerCapacity) {
            newAircraft.passengerCapacity = passengerCapacity;
            return this;
        }

        public Builder withMaxSpeed(int maxSpeed) {
            newAircraft.maxSpeed = maxSpeed;
            return this;
        }

        public Builder withRangeInKm(double rangeInKm) {
            newAircraft.rangeInKm = rangeInKm;
            return this;
        }

        public Builder withPayloadInKg(int payloadInKg) {
            newAircraft.payloadInKg = payloadInKg;
            return this;
        }

        public Builder withLengthInM(double lengthInM) {
            newAircraft.lengthInM = lengthInM;
            return this;
        }

        public Builder withHeightInM(double heightInM) {
            newAircraft.heightInM = heightInM;
            return this;
        }

        public Builder withWingSpanInM(double wingSpanInM) {
            newAircraft.wingSpanInM = wingSpanInM;
            return this;
        }

        public Aircraft build() {
            return newAircraft;
        }
    }
}
