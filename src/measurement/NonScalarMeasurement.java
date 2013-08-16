package measurement;

public class NonScalarMeasurement extends Measurement {

    public static final int NUMBER_OF_TEMPERATURE_INSTANCES = 2;

    public NonScalarMeasurement(Unit unit, int value) {
        super(unit, value);
    }


    public NonScalarMeasurement add(NonScalarMeasurement measurement) {
        int averageTemperature = (this.value + measurement.value) / NUMBER_OF_TEMPERATURE_INSTANCES;
        return new NonScalarMeasurement(this.unit, averageTemperature);
    }

}
