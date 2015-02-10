package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public class Barbell extends Weight {

    public static final String NAME = "Barbell" ;
    private static final String UNIT = "lbs" ;
    private static double MINIMUM = 0.0 ;
    private static double STEP = 2.5 ;

    public Barbell(double force) {
        super(NAME, force, UNIT) ;
    }

    @Override
    public void next() {
        mForce += STEP ;
    }

    @Override
    protected void previous() {
        if (mForce >= MINIMUM + STEP) {
            mForce -= 2.5 ;
        }
    }

}