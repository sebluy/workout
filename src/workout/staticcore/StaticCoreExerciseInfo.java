package workout.staticcore;

import workout.Exercise;

/**
 * Created by sebluy on 12/25/14.
 */

public class StaticCoreExerciseInfo {

    private String mName ;

    private double mDuration;

    public StaticCoreExerciseInfo(String name, double duration) {
        mName = name ;
        mDuration = duration ;
    }

    public String getName() {
        return mName ;
    }

    public double getDuration() {
        return mDuration ;
    }

    public void setDuration(double duration) {
        mDuration = duration ;
    }

    public Exercise newExercise() {
        return new StaticCoreExercise(mName, mDuration) ;
    }
}
