package workout.lifting;


import workout.lifting.weight.BaseWeight;

/**
 * Created by sebluy on 12/20/14.
 */
public class LiftingExerciseInfo {

    private String mName ;
    private BaseWeight mWeight ;
    private int mRepetitions ;

    public LiftingExerciseInfo(String name, BaseWeight weight, int repetitions) {
        mName = name ;
        mWeight = weight ;
        mRepetitions = repetitions ;
    }

    public LiftingExercise newExercise() {
        return new LiftingExercise(mName, mWeight.toString(), mRepetitions) ;
    }

    public void update(LiftingExercise exercise) {
        int performedRepetitions = exercise.getPerformedRepetitions() ;
        if (performedRepetitions > 2) {
            mRepetitions = performedRepetitions - 2 ;
        } else if (performedRepetitions > 0) {
            mRepetitions = 1 ;
            mWeight.next() ;
        } else {
            mRepetitions = 20 ;
            mWeight.reset() ;
        }
    }

    public int getRepetitions() {
        return mRepetitions;
    }

    public BaseWeight getWeight() {
        return mWeight;
    }
}
