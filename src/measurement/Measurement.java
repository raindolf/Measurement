package measurement;


public class Measurement {
    protected int value;
    protected Unit unit;

    public Measurement(Unit unit, int value) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Measurement that = (Measurement) o;
        if (validateType(that)) {
            if (this.convertToBaseUnits() != that.convertToBaseUnits()) return false;
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        return result;
    }

    protected int convertToBaseUnits() {
        return this.value * (this.unit.getBaseUnit());
    }

    protected boolean validateType(Measurement scalarMeasurement) {
        return this.unit.getType() == scalarMeasurement.unit.getType();
    }

}
