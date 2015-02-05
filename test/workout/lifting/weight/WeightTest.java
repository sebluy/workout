package workout.lifting.weight;

import junit.framework.TestCase;

public class WeightTest extends TestCase {

    private Weight mWeight ;

    public void testNewInstance() {

    }

    public void setUp() throws Exception {
        super.setUp();
        mWeight = new Weight("Test Weight", 54.321, "lbs") {
            @Override
            public void next() {
            }

            @Override
            protected void previous() {
            }
        } ;
    }

    public void testToString() {
        assertEquals("54.3 lbs", mWeight.toString()) ;
    }

}