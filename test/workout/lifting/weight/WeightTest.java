package workout.lifting.weight;

import junit.framework.TestCase;

public class WeightTest extends TestCase {

    public void testToString() {
        Weight weight = new Weight("Test Weight", 54.321, "lbs") {
            @Override
            public void next() {
            }

            @Override
            protected void previous() {
            }
        } ;
        assertEquals("54.3 lbs", weight.toString()) ;
    }

}