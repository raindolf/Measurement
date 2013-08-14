public enum Unit {
    FOOT(12),INCH(1),YARD(36),MILE(63360);

    private final int baseUnit;

    Unit(int baseUnit) {
        this.baseUnit = baseUnit;
    }

    public int getBaseUnit() {
        return baseUnit;
    }
}
