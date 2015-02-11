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

    @Override
    public double next(double force) {
        if (force >= 30) {
            force += 5;
        } else {
            force += 2.5;
        }
        return Math.min(force, Dumbbell.MAXIMUM) ;
    }

    private double previous(double force) {
        if (force >= 35) {
            force -= 5;
        } else {
            force -= 2.5;
        }
        return Math.max(force, Dumbbell.MINIMUM) ;
    }

}