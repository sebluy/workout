package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public abstract class Weight {

    private static final int RESET_STEPS = 10 ;

    public static Weight newInstance(String name, double force) {
        switch (name) {
            case Plate.NAME: return new Plate(force) ;
            case MachineLBS.NAME: return new MachineLBS(force) ;
            case CalfMachine.NAME: return new CalfMachine(force) ;
            case Barbell.NAME: return new Barbell(force) ;
            case Dumbbell.NAME: return new Dumbbell(force) ;
            default: return null ;
        }
    }

    protected double mForce ;
    private String mName ;
    private String mUnit ;

    public Weight(String name, double force, String unit) {
        mName = name ;
        mForce = force ;
        mUnit = unit ;
    }

    public abstract void next() ;
    protected abstract void previous() ;

    public void reset() {
        for (int i = 0 ; i < RESET_STEPS ; i++) {
            previous() ;
        }
    }

    public String toString() {
        return String.format("%.1f %s", mForce, mUnit) ;
    }

    public String getUnit() {
        return mUnit ;
    }

    public String getName() {
        return mName ;
    }

    public double getForce() {
        return mForce ;
    }

}