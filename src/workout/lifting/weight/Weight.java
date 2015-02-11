package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public class Weight {

    private Weights mWeight ;
    private double mForce ;

    public Weight(Weights weight, double force) {
        mWeight = weight ;
        mForce = force ;
    }

    public String toString() {
        return String.format("%.1f %s", getForce(), getUnit()) ;
    }

    public double getForce() {
        return mForce ;
    }

    public void next() {
        mForce = mWeight.next(mForce) ;
    }

    public void reset() {
        mForce = mWeight.reset(mForce) ;
    }

    public String getUnit() {
        return mWeight.getUnit() ;
    }

    public String getName() {
        return mWeight.getName() ;
    }

}