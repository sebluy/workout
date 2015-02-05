package workout.lifting;

import workout.Exercise;
import workout.Workout;

/**
 * Created by sebluy on 1/18/15.
 */
public class LiftingWorkoutCommitter {


    private LiftingWorkoutStorage mStorage ;

    public LiftingWorkoutCommitter(LiftingWorkoutController controller) {
        mStorage = controller.getStorage() ;
    }

    public void commit(Workout workout) {
        for (Exercise exercise : ((LiftingWorkout)workout).getExercises()) {
            LiftingExerciseInfo changedExercise = mStorage.getExercise(exercise.getName()) ;
            changedExercise.update((LiftingExercise)exercise) ;
        }
        mStorage.commit() ;
    }

}
