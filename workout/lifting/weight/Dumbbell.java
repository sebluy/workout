package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public class Dumbbell extends Weight {

    public static final String NAME = "Dumbbell" ;

    private static final String UNIT = "lbs" ;
    private static final int MINIMUM = 5 ;
    private static final int MAXIMUM = 100 ;

    public Dumbbell(double force) {
        super(NAME, force, UNIT) ;
    }

    @Override
    public void next() {
        if (mForce == MAXIMUM) {
            return ;
        }
        if (mForce >= 30) {
            mForce += 5 ;
        } else {
            mForce += 2.5 ;
        }
    }

    @Override
    protected void previous() {
        if (mForce == MINIMUM) {
            return ;
        }
        if (mForce >= 35) {
            mForce -= 5 ;
        } else {
            mForce -= 2.5 ;
        }
    }

}