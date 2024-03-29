package workout.staticcore;

/**
 * Created by sebluy on 1/22/15.
 */
public class StaticCoreExerciseFeedback {

    private int mDifficulty ;
    private StaticCoreExercise mExercise ;

    public StaticCoreExerciseFeedback(StaticCoreExercise exercise) {
        mExercise = exercise;
        mDifficulty = 5;
    }

    public int getDifficulty() {
        return mDifficulty ;
    }

    public void setDifficulty(int difficulty) {
        mDifficulty = difficulty ;
    }

    public StaticCoreExercise getExercise() {
        return mExercise ;
    }

}
