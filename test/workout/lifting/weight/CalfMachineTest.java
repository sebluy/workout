package workout.lifting.weight;

import junit.framework.TestCase;

public class CalfMachineTest extends TestCase {

    public void testNewInstance() {
        Weight weight = Weight.newInstance("Calf Machine", 100.0) ;
        assert(weight instanceof CalfMachine) ;
        assertEquals("Calf Machine", weight.getName()) ;
        assertEquals(100.0, weight.getForce(), 0.01) ;
        assertEquals("lbs", weight.getUnit()) ;
    }

    public void testNext() {
        Weight weight = new CalfMachine(100.0) ;
        weight.next() ;
        assertEquals(110.0, weight.getForce(), 0.01) ;
    }

    public void testReset() {
        Weight weight = new CalfMachine(110.0) ;
        weight.reset() ;
        assertEquals(10.0, weight.getForce(), 0.01) ;
    }

    public void testResetDoesNotFallBelowMinimum() {
        Weight weight = new CalfMachine(50.0) ;
        weight.reset() ;
        assertEquals(0.0, weight.getForce(), 0.01) ;
    }
}