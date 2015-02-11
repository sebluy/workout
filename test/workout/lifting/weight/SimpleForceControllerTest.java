package workout.lifting.weight;

import junit.framework.TestCase;

public class SimpleForceControllerTest extends TestCase {

    public void testNext() {
        SimpleForceController controller = SimpleForceController.BARBELL ;
        assertEquals(47.5, controller.next(45.0), 0.01) ;
    }

    public void testReset() {
        SimpleForceController controller = SimpleForceController.BARBELL ;
        assertEquals(20.0, controller.reset(45.0), 0.01) ;
    }

    public void testResetDoesNotFallBelowMinimum() {
        SimpleForceController controller = SimpleForceController.BARBELL ;
        assertEquals(0.0, controller.reset(20.0), 0.01) ;
    }

}