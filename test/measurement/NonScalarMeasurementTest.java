package measurement;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NonScalarMeasurementTest {
    @Test
    public void shouldCalculateTwoTemperaturesOfSimilarTypes(){
        NonScalarMeasurement nonScalarMeasurement = new NonScalarMeasurement(Unit.CELSIUS, 20);
        NonScalarMeasurement nonScalarMeasurement1 = new NonScalarMeasurement(Unit.CELSIUS, 40);
        assertThat(nonScalarMeasurement.add(nonScalarMeasurement1), is(new NonScalarMeasurement(Unit.CELSIUS, 30)));
    }
}


