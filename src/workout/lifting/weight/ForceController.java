package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public interface ForceController {

    public static final int RESET_STEPS = 10 ;

    double next(double force) ;

    double reset(double force) ;

}