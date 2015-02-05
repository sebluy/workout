package lifting.weight;

import junit.framework.TestCase;
import workout.lifting.weight.Dumbbell;

public class DumbbellTest extends TestCase {

    public void testNextWithLargeForce() {
        Dumbbell dumbbell = new Dumbbell(30.0) ;
        dumbbell.next() ;
        assertEquals(35.0, dumbbell.getForce(), 0.01) ;
    }

    public void testNextWithSmallForce() {
        Dumbbell dumbbell = new Dumbbell(27.5) ;
        dumbbell.next() ;
        assertEquals(30.0, dumbbell.getForce(), 0.01) ;
    }

    public void testNextDoesNotExceedMaximum() {
        Dumbbell dumbbell = new Dumbbell(100.0) ;
        dumbbell.next() ;
        assertEquals(100.0, dumbbell.getForce(), 0.01);
    }

    public void testResetWithSmallForce() {
        Dumbbell dumbbell = new Dumbbell(30) ;
        dumbbell.reset() ;
        assertEquals(5.0, dumbbell.getForce(), 0.01) ;
    }

    public void testResetWithLargeForce() {
        Dumbbell dumbbell = new Dumbbell(90) ;
        dumbbell.reset() ;
        assertEquals(40, dumbbell.getForce(), 0.01) ;
    }

    public void testResetWithMediumForce() {
        Dumbbell dumbbell = new Dumbbell(50) ;
        dumbbell.reset() ;
        assertEquals(15, dumbbell.getForce(), 0.01) ;
    }

    public void testResetDoesNotFallBelowMinimum() {
        Dumbbell dumbbell = new Dumbbell(10) ;
        dumbbell.reset() ;
        assertEquals(5.0, dumbbell.getForce(), 0.01) ;
    }

}