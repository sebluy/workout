package workout.calisthenic;

import workout.Exercise;

/**
 * Created by sebluy on 12/22/14.
 */
public class CalisthenicExercise extends Exercise {

    private int mRepetitions ;

    public CalisthenicExercise(String name, int repetitions) {
        super(name) ;
        mRepetitions = repetitions ;
    }

    public int getRepetitions() {
        return mRepetitions;
    }
}
