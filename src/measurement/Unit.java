package measurement;

public enum Unit {
    FOOT(12, Type.LENGTH),INCH(1, Type.LENGTH),YARD(36,Type.LENGTH),MILE(663360,Type.LENGTH),
    TABLESPOON(3,Type.VOLUME), TEASPOON(1,Type.VOLUME),
    CELSIUS(1,Type.TEMPERATURE );
    private int baseUnit;
    private final Type type;

    private Unit(int baseUnit,Type type) {
        this.baseUnit = baseUnit;
        this.type = type;
    }

    public int getBaseUnit() {
        return baseUnit;
    }

    public Type getType() {
        return type;
    }
}
