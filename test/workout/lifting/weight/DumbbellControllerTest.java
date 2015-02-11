package workout.lifting.weight;

import junit.framework.TestCase;

public class DumbbellControllerTest extends TestCase {

    public void testNextWithLargeForce() {
        DumbbellForceController dumbbell = new DumbbellForceController() ;
        assertEquals(35.0, dumbbell.next(30), 0.01) ;
    }

    public void testNextWithSmallForce() {
        DumbbellForceController dumbbell = new DumbbellForceController() ;
        assertEquals(30.0, dumbbell.next(27.5), 0.01) ;
    }

    public void testNextDoesNotExceedMaximum() {
        DumbbellForceController dumbbell = new DumbbellForceController() ;
        assertEquals(100.0, dumbbell.next(100.0), 0.01) ;
    }

    public void testResetWithSmallForce() {
        DumbbellForceController dumbbell = new DumbbellForceController() ;
        assertEquals(5.0, dumbbell.reset(30.0), 0.01) ;
    }

    public void testResetWithLargeForce() {
        DumbbellForceController dumbbell = new DumbbellForceController() ;
        assertEquals(40.0, dumbbell.reset(90.0), 0.01) ;
    }

    public void testResetWithMediumForce() {
        DumbbellForceController dumbbell = new DumbbellForceController() ;
        assertEquals(15.0, dumbbell.reset(50.0), 0.01) ;
    }

    public void testResetDoesNotFallBelowMinimum() {
        DumbbellForceController dumbbell = new DumbbellForceController() ;
        assertEquals(5.0, dumbbell.reset(10.0), 0.01) ;
    }

}