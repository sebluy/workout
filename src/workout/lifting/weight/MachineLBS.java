package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public class MachineLBS extends Weight {

    public static final String NAME = "Machine (lbs)" ;
    private static final String UNIT = "lbs" ;
    private static final double MINIMUM = 5.0 ;
    private static final double STEP = 5.0 ;

    public MachineLBS(double force) {
        super(NAME, force, UNIT) ;
    }

    @Override
    public void next() {
        mForce += STEP ;
    }

    @Override
    protected void previous() {
        if (mForce >= MINIMUM + STEP) {
            mForce -= STEP;
        }

    }

}