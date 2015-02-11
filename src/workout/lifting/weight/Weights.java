package workout.lifting.weight;

/**
 * Created by sebluy on 1/29/15.
 */
public enum Weights {

    PLATE(Plate.NAME, Plate.UNIT, SimpleForceController.PLATE),
    MACHINE_LBS(MachineLBS.NAME, MachineLBS.UNIT, SimpleForceController.MACHINE_LBS),
    BARBELL(Barbell.NAME, Barbell.UNIT, SimpleForceController.BARBELL),
    CALF_MACHINE(CalfMachine.NAME, CalfMachine.UNIT, SimpleForceController.CALF_MACHINE),
    DUMBBELL(Dumbbell.NAME, Dumbbell.UNIT, new DumbbellForceController()) ;

    private String mName ;
    private String mUnit ;
    private ForceController mController ;

    public static Weight newInstance(Weights weight, double force) {
        return new Weight(weight, force) ;
    }

    Weights(String name, String unit, ForceController controller) {
        mName = name ;
        mUnit = unit ;
        mController = controller ;
    }

    public String getName() {
        return mName;
    }

    public String getUnit() {
        return mUnit;
    }

    public double next(double force) {
        return mController.next(force);
    }

    public double reset(double force) {
        return mController.reset(force);
    }
}