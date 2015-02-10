package workout.lifting.weight;

import junit.framework.TestCase;

public class BarbellTest extends TestCase {

    public void testWeightNewInstance() {
        Weight weight = Weight.newInstance("Barbell", 45.0) ;
        assert(weight instanceof Barbell) ;
        assertEquals(45.0, weight.getForce(), 0.01) ;
    }

    public void testNext() {
        Barbell barbell = new Barbell(50.0) ;
        barbell.next() ;
        assertEquals(52.5, barbell.getForce(), 0.01) ;
    }

    public void testPrevious() {
        Barbell barbell = new Barbell(50.0) ;
        barbell.reset() ;
        assertEquals(25.0, barbell.getForce(), 0.01) ;
    }

    public void testPreviousDoesNotFallBelowMinimum() {
        Barbell barbell = new Barbell(12.5) ;
        barbell.reset() ;
        assertEquals(0.0, barbell.getForce(), 0.01) ;
    }
}