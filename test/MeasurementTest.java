import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class MeasurementTest {

    @Test
    public void shouldCompareTwoMeasurementValues() {

        Measurement measurement1 = new Measurement(2, Unit.FOOT);
        Measurement measurement2 = new Measurement(2, Unit.FOOT);
        assertThat(measurement1, is(measurement2));
    }

    @Test
    public void shouldCompareTwoOfDiffUnits(){
        Measurement measurement1 = new Measurement(2, Unit.FOOT);
        Measurement measurement2 = new Measurement(24, Unit.INCH);

        assertThat(measurement1, is(measurement2));
    }
}
