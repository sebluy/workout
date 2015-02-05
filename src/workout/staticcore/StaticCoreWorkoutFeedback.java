package workout.staticcore;

import workout.Exercise;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by sebluy on 12/25/14.
 */

public class StaticCoreWorkoutFeedback {

    private ArrayList<StaticCoreExerciseFeedback> mFeedbackList ;

    public StaticCoreWorkoutFeedback(StaticCoreWorkout workout) {
        HashSet<String> added = new HashSet<String>() ;
        mFeedbackList = new ArrayList<>() ;
        for (Exercise exercise : workout.getExercises()) {
            String exerciseName = exercise.getName() ;
            if (!added.contains(exerciseName)) {
                mFeedbackList.add(new StaticCoreExerciseFeedback((StaticCoreExercise)exercise)) ;
                added.add(exerciseName) ;
            }
        }
    }

    public ArrayList<StaticCoreExerciseFeedback> getFeedbackList() {
        return mFeedbackList;
    }

}
