package workout.staticcore;

import workout.Workout;
import workout.WorkoutController;

/**
 * Created by sebluy on 12/25/14.
 */
public class StaticCoreWorkoutController implements WorkoutController {

    public static final String NAME = "Static Core" ;

    private StaticCoreWorkoutGenerator mGenerator ;
    private StaticCoreWorkoutStorage mStorage ;

    public StaticCoreWorkoutController(StaticCoreWorkoutStorage storage) {
        mStorage = storage ;
        mGenerator = new StaticCoreWorkoutGenerator(this) ;
    }

    @Override
    public Workout generate() {
        return mGenerator.generate() ;
    }

    @Override
    public void commit(Workout workout) {
        StaticCoreWorkoutFeedback feedback = ((StaticCoreWorkout)workout).getFeedback() ;
        for (StaticCoreExerciseFeedback exerciseFeedback : feedback.getFeedbackList()) {
            String name = exerciseFeedback.getExercise().getName() ;
            StaticCoreExerciseInfo exercise = mStorage.getExercise(name) ;
            double oldDuration = exercise.getDuration() ;
            double newDuration = oldDuration * Math.pow(1.05, (5 - exerciseFeedback.getDifficulty())) ;
            exercise.setDuration(newDuration) ;
        }
        mStorage.commit() ;
    }

    public StaticCoreWorkoutStorage getStorage() {
        return mStorage ;
    }


    public String getName() {
        return NAME ;
    }

}
