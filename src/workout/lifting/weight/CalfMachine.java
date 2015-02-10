package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public class CalfMachine extends Weight {

    public static final String NAME = "Calf Machine" ;
    private static final String UNIT = "lbs" ;
    private static final double MINIMUM = 0.0 ;
    private static final double STEP = 10.0 ;

    public CalfMachine(double force) {
        super(NAME, force, UNIT) ;
    }

    @Override
    public void next() {
        mForce += STEP ;
    }

    @Override
    protected void previous() {
        if (mForce >= MINIMUM + STEP) {
            mForce -= STEP ;
        }
    }

}