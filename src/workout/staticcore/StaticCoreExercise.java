package workout.staticcore;

import workout.Exercise;

/**
 * Created by sebluy on 12/25/14.
 */

public class StaticCoreExercise extends Exercise implements Cloneable {

    private double mDuration ;

    public StaticCoreExercise(String name, double duration) {
        super(name) ;
        mDuration = duration ;
    }

    public double getDuration() {
        return mDuration ;
    }
}
