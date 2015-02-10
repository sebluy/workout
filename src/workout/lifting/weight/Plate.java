package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public class Plate extends Weight {

    public static final String NAME = "Plate" ;
    private static final String UNIT = "Plates" ;
    private static final double MINIMUM = 1.0 ;
    private static final double STEP = 0.5 ;

    public Plate(double force) {
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