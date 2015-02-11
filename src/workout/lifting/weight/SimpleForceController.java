package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public enum SimpleForceController implements ForceController {

    PLATE(Plate.MINIMUM, Plate.STEP),
    MACHINE_LBS(MachineLBS.MINIMUM, MachineLBS.STEP),
    CALF_MACHINE(CalfMachine.MINIMUM, CalfMachine.STEP),
    BARBELL(Barbell.MINIMUM, Barbell.STEP) ;

    private double mMinimum ;
    private double mStep ;

    SimpleForceController(double minimum, double step)  {
        mMinimum = minimum ;
        mStep = step ;
    }

    public double next(double force) {
        return force + mStep ;
    }

    public double reset(double force) {
        return Math.max(mMinimum, force - mStep*ForceController.RESET_STEPS) ;
    }

}