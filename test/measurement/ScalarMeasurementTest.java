package measurement;

import measurement.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ScalarMeasurementTest {


    @Test
    public void shouldCompareTwoSimilarMeasurementQuantities(){
        Measurement twoFeet = new ScalarMeasurement(Unit.FOOT, 2);
        Measurement fourFeet = new ScalarMeasurement(Unit.FOOT, 2);
        assertThat(twoFeet, is(fourFeet));
    }

    @Test
    public void shouldCompareTwoDifferentMeasurementQuantities(){
        ScalarMeasurement twelveInches = new ScalarMeasurement(Unit.INCH, 12);
        ScalarMeasurement oneFoot = new ScalarMeasurement(Unit.FOOT, 1);
        assertThat(twelveInches, is(oneFoot));
    }

    @Test
    public void shouldCompareATableSpoonAndATeaSpoon(){
        ScalarMeasurement oneTblSpoon = new ScalarMeasurement(Unit.TABLESPOON, 1);
        ScalarMeasurement threeTeaSpoons = new ScalarMeasurement(Unit.TEASPOON, 3);
        assertThat(oneTblSpoon,is(threeTeaSpoons));
    }

    @Test
    public void shouldFailIfComparingDifferentMeasurementQuantities(){
        assertFalse(new ScalarMeasurement(Unit.FOOT, 1) == new ScalarMeasurement(Unit.TABLESPOON, 1));

    }
    @Test
    public void shouldAddUnitsOfSameType(){
        ScalarMeasurement scalarMeasurement = new ScalarMeasurement(Unit.FOOT, 1);
        ScalarMeasurement measurement1 = new ScalarMeasurement(Unit.FOOT, 2);
        assertThat(scalarMeasurement.add(measurement1), is(new ScalarMeasurement(Unit.FOOT, 3)));
    }

    @Test(expected = UnitTypeMissMatchException.class)
    public void shouldThrowAnExceptionWhenTwoDifferentMeasurementTypesAreAdded(){
        ScalarMeasurement scalarMeasurement = new ScalarMeasurement(Unit.TEASPOON, 1);
        ScalarMeasurement measurement1 = new ScalarMeasurement(Unit.FOOT, 2);
        ScalarMeasurement result = scalarMeasurement.add(measurement1);
        assertThat(result, is(new ScalarMeasurement(Unit.FOOT, 3)));
    }


}
