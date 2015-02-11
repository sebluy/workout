package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public class DumbbellForceController implements ForceController {

    @Override
    public double reset(double force) {
        for (int i = 0 ; i < ForceController.RESET_STEPS ; i++) {
            force = previous(force) ;
        }
        return force ;
    }

    private static final double MINIMUM = 5.0 ;
    private static final double MAXIMUM = 100.0 ;
    private static final double BOUNDARY = 30.0 ;
    private static final double EPSILON = 0.1 ; // do not let round off error fool boundary
    private static final double SMALL_STEP = 2.5 ;
    private static final double LARGE_STEP= 5.0 ;

    @Override
    public double next(double force) {
        if (force >= BOUNDARY - EPSILON) {
            force += LARGE_STEP ;
        } else {
            force += SMALL_STEP ;
        }
        return Math.min(force, MAXIMUM) ;
    }

    private double previous(double force) {
        if (force <= BOUNDARY + EPSILON) {
            force -= SMALL_STEP ;
        } else {
            force -= LARGE_STEP ;
        }
        return Math.max(force, MINIMUM) ;
    }

}