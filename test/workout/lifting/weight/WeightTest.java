package workout.lifting.weight;

import junit.framework.TestCase;

public class WeightTest extends TestCase {

    public void testToString() {
        Weight weight = new TestWeight("Test Weight", 54.321, "lbs") ;
        assertEquals("54.3 lbs", weight.toString()) ;
    }

    public void testConstructorAndGettersAndSetters() {
        Weight weight = new TestWeight("TestWeight", 20.0, "lbs") ;
        assertEquals(20.0, weight.getForce(), 0.01) ;
        assertEquals("TestWeight", weight.getName()) ;
        assertEquals("lbs", weight.getUnit()) ;
    }

    private class TestWeight extends Weight {

        public TestWeight(String name, double force, String unit) {
            super(name, force, unit) ;
        }

        @Override
        public void next() {}

        @Override
        protected void previous() {}

    }

}