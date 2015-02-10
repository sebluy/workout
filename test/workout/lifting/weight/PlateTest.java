package workout.lifting.weight;

import junit.framework.TestCase;

public class PlateTest extends TestCase {

    public void testNewInstance() {
        Weight weight = Weight.newInstance("Plate", 10.0) ;
        assert(weight instanceof Plate) ;
        assertEquals("Plate", weight.getName()) ;
        assertEquals(10.0, weight.getForce(), 10.0) ;
        assertEquals("Plates", weight.getUnit()) ;
    }

    public void testNext() {
        Weight weight = new Plate(10.0) ;
        weight.next() ;
        assertEquals(10.5, weight.getForce(), 0.01) ;
    }


    public void testReset() {
        Weight weight = new Plate(10.0) ;
        weight.reset() ;
        assertEquals(5.0, weight.getForce(), 0.01) ;
    }

    public void testResetDoesNotFallBelowMinimum() {
        Weight weight = new Plate(2.0) ;
        weight.reset() ;
        assertEquals(1.0, weight.getForce(), 0.01);
    }

}