package workout.lifting.weight;

import junit.framework.TestCase;

public class MachineLBSTest extends TestCase {

    public void testWeightNewInstance() {
        Weight weight = Weight.newInstance("Machine (lbs)", 45.0) ;
        assert(weight instanceof MachineLBS) ;
        assertEquals("Machine (lbs)", weight.getName());
        assertEquals(45.0, weight.getForce(), 0.01) ;
        assertEquals("lbs", weight.getUnit()) ;
    }

    public void testNext() {
        Weight weight = new MachineLBS(50.0) ;
        weight.next() ;
        assertEquals(55.0, weight.getForce(), 0.01) ;
    }

    public void testReset() {
        Weight weight = new MachineLBS(75.0) ;
        weight.reset() ;
        assertEquals(25.0, weight.getForce(), 0.01) ;
    }

    public void testResetDoesNotFallBelowMinimum() {
        Weight weight = new MachineLBS(25.0);
        weight.reset();
        assertEquals(5.0, weight.getForce(), 0.01);
    }

}