package workout.lifting;

import workout.Workout;
import workout.WorkoutController;

/**
 * Created by sebluy on 1/18/15.
 */
public class LiftingWorkoutController implements WorkoutController {

    public static LiftingWorkoutController newUpper(LiftingWorkoutStorage storage) {
        return new LiftingWorkoutController(LiftingWorkout.UPPER_NAME, storage) ;
    }

    public static LiftingWorkoutController newLower(LiftingWorkoutStorage storage) {
        return new LiftingWorkoutController(LiftingWorkout.LOWER_NAME, storage) ;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    private String mName;

    private LiftingWorkoutOrderGenerator mOrderGenerator ;
    private LiftingWorkoutGenerator mGenerator ;
    private LiftingWorkoutStorage mStorage ;
    private LiftingWorkoutCommitter mCommitter ;

    public LiftingWorkoutController(String name, LiftingWorkoutStorage storage) {
        mName = name ;
        mStorage = storage ;
        mOrderGenerator = new LiftingWorkoutOrderGenerator(storage) ;
        mGenerator = new LiftingWorkoutGenerator(this) ;
        mCommitter = new LiftingWorkoutCommitter(this) ;
    }

    @Override
    public Workout generate() {
        return mGenerator.generate() ;
    }

    @Override
    public void commit(Workout workout) {
        mCommitter.commit(workout) ;
    }

    public LiftingExerciseInfo getExercise(String name) {
        return mStorage.getExercise(name) ;
    }

    public LiftingWorkoutStorage getStorage() {
        return mStorage ;
    }

    public String getName() {
        return mName;
    }

    public LiftingWorkoutOrderGenerator getOrderGenerator() {
        return mOrderGenerator;
    }
}
