package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public class Barbell extends Weight {

    public static final String NAME = "Barbell" ;
    private static final String UNIT = "lbs" ;
    private static int MINIMUM = 0 ;

    public Barbell(double force) {
        super(NAME, force, UNIT) ;
    }

    @Override
    public void next() {
        mForce += 2.5 ;
    }

    @Override
    protected void previous() {
        if (mForce > MINIMUM) {
            mForce -= 2.5 ;
        }
    }

}