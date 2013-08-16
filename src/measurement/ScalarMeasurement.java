package measurement;

public class ScalarMeasurement extends Measurement {

    public ScalarMeasurement(Unit unit, int value) {
        super(unit, value);
    }

    /*public boolean compareWith(measurement.ScalarMeasurement measurement) {
       return measurement.convertToBaseUnits() == this.convertToBaseUnits();
    }*/

    public ScalarMeasurement add(Measurement measurement) {
        if (validateType(measurement)) {
            int value = addInBaseUnits(measurement);
            return new ScalarMeasurement(this.unit, value);
        } else {
            throw new UnitTypeMissMatchException();
        }
    }

    private int addInBaseUnits(Measurement scalarMeasurement) {
            return (this.convertToBaseUnits() + scalarMeasurement.convertToBaseUnits()) / this.convertToBaseUnits();
    }
}
