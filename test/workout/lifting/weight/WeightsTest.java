package workout.lifting.weight;

import junit.framework.TestCase;

public class WeightsTest extends TestCase {

    public void testWeights() {
        Weight barbell = Weights.newInstance(Weights.BARBELL, 45.0) ;
        assertEquals("Barbell", barbell.getName()) ;
        assertEquals("lbs", barbell.getUnit()) ;
        assertEquals(45.0, barbell.getForce()) ;
        barbell.next() ;
        assertEquals(47.5, barbell.getForce()) ;
        barbell.reset() ;
        assertEquals(22.5, barbell.getForce()) ;
        assertEquals("22.5 lbs", barbell.toString()) ;
    }

}