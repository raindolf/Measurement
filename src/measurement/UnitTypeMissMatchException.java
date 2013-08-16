package measurement;

public class UnitTypeMissMatchException extends RuntimeException {
    public UnitTypeMissMatchException() {
        super("These are two different measurements.");
    }
}
